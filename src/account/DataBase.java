
/**
 *
 * @author Rahana,Anu,Sebin,Pratheesh
 */
 
package account;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;



public class DataBase {
    

    public DataBase(String databaseName) {
        this.dbName = databaseName;
        setDBSystemDir();
        dbProperties = loadDBProperties();
        String driverName = dbProperties.getProperty("derby.driver");
        loadDatabaseDriver(driverName);
        if(!dbExists()) {
            createDatabase();
        }

    }

    private boolean dbExists() {
        boolean bExists = false;
        String dbLocation = getDatabaseLocation();
        File dbFileDir = new File(dbLocation);
        if (dbFileDir.exists()) {
            bExists = true;
        }
        return bExists;
    }

    private void setDBSystemDir() {
        // decide on the db system directory
        String userHomeDir = System.getProperty("/", ".");
        String systemDir = userHomeDir + "/.db";
        System.setProperty("derby.system.home", systemDir);

        // create the db system directory
        File fileSystemDir = new File(systemDir);
        fileSystemDir.mkdir();
    }

    private void loadDatabaseDriver(String driverName) {
        // load Derby driver
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    private Properties loadDBProperties() {
        InputStream dbPropInputStream = null;
        dbPropInputStream = DataBase.class.getResourceAsStream("Configuration.properties");
        dbProperties = new Properties();
        try {
            dbProperties.load(dbPropInputStream);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return dbProperties;
    }


    private boolean createTables(Connection dbConnection) {
        boolean bCreatedTables = false;
        Statement statement = null;
        try {
            statement = dbConnection.createStatement();
            statement.execute(strCreateAcc);
            statement.execute(strCreatePT);
            bCreatedTables = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return bCreatedTables;
    }
    private boolean createDatabase() {
        boolean bCreated = false;
        Connection dbConn = null;

        String dbUrl = getDatabaseUrl();
        //System.out.println(dbUrl);
        dbProperties.put("create", "true");

        try {
            //System.out.println(dbUrl);
            dbConn = DriverManager.getConnection(dbUrl, dbProperties);
            bCreated = createTables(dbConn);
            //System.out.println(bCreated);
        } catch (SQLException ex) {
        }
        dbProperties.remove("create");
        return bCreated;
    }

    public boolean connect() {
        try {
            String strUrl = "jdbc:derby:Account;user=app;password=app";
            dbConnection = DriverManager.getConnection(strUrl);
            isConnected = dbConnection != null;
        } catch (SQLException ex) {
            isConnected = false;
        }
        return isConnected;
    }
    


    public void disconnect() {
        if(isConnected) {
            String dbUrl = getDatabaseUrl();
            dbProperties.put("shutdown", "true");
            try {
                DriverManager.getConnection(dbUrl, dbProperties);
            } catch (SQLException ex) {
            }
            isConnected = false;
        }
    }

    public String getDatabaseLocation() {
        String dbLocation = System.getProperty("derby.system.home") + "/" + dbName;
        return dbLocation;
    }

    public String getDatabaseUrl() {
        String dbUrl = dbProperties.getProperty("derby.url") + dbName;
        return dbUrl;
    }



    public static void main(String[] args) {
        DataBase db = new DataBase("Account");
        System.out.println(db.getDatabaseLocation());
        System.out.println(db.getDatabaseUrl());
        db.connect();
        //db.disconnect();
    }

    private Properties dbProperties;
    private boolean isConnected;
    private String dbName;
    Connection dbConnection;
    private static final String strCreateAcc =
            "create table APP.ACC ("            +
            "    CUSTID         VARCHAR(5), "   +
            "    CUSTNAME       VARCHAR(25), "  +
            "    SERIAL         VARCHAR(20), "  +
            "    PRODNAME       VARCHAR(25), "  +
            "    QUANTITY       VARCHAR(10), "  +
            "    VALUE          VARCHAR(20), "  +
            "    TAXRATE        VARCHAR(20), "  +
            "    DISCOUNTRATE   VARCHAR(20), "  +
            "    AMOUNT         VARCHAR(20), "  +
            "    DAY            VARCHAR(5), "   +
            "    MONTH          VARCHAR(5), "   +
            "    YER            VARCHAR(20) )";
            
    private static final String strCreatePT =
            "create table APP.PT ("             +
            "    PRODID         VARCHAR(5), "   +
            "    PRODNAME       VARCHAR(25), "  +
            "    UNIT           VARCHAR(25), "  +
            "    QUANTITY       VARCHAR(20), "  +
            "    VALUE          VARCHAR(25), "  +
            "    EXPDAY         VARCHAR(25), "  +
            "    EXPMON         VARCHAR(25), "  +
            "    EXPYER        VARCHAR(25) "   +
            ")";
    

}
