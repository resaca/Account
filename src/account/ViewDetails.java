/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ViewDetails.java
 *
 * Created on Oct 4, 2011, 8:10:28 PM
 */

package account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebi
 */
public class ViewDetails extends javax.swing.JFrame {

    /** Creates new form ViewDetails */
    public ViewDetails() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbDate = new javax.swing.JComboBox();
        cmbMonth = new javax.swing.JComboBox();
        cmbYear = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Details");
        setResizable(false);

        jLabel1.setText("Customer Name");

        jLabel2.setText("Date");

        cmbDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "dd", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mm", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "yyyy", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Customer ID", "Date", "Serial", "Product Name", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(viewTable);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Customer ID");

        jButton1.setText("Make a bill");

        delButton.setText("Delete this record");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Enter new product");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(searchButton)
                        .addGap(12, 12, 12))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(delButton)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(delButton)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
            // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel) viewTable.getModel();
            model.setRowCount(0);
            String name=nameField.getText();
            String id=idField.getText();
            String day=cmbDate.getSelectedItem().toString();
            String month=cmbMonth.getSelectedItem().toString();
            String year=cmbYear.getSelectedItem().toString();
            String strUrl = "jdbc:derby:Account;user=app;password=app";
            String query="";
            Connection dbConnection = DriverManager.getConnection(strUrl);
            Statement stmtAcc = dbConnection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = null;
            if (!nameField.getText().isEmpty() && !idField.getText().isEmpty() && cmbDate.getSelectedIndex()!=0&& cmbMonth.getSelectedIndex()!=0&& cmbYear.getSelectedIndex()!=0) {
                query = "select CUSTNAME, CUSTID, DAY, MONTH, YER, SERIAL, PRODNAME, AMOUNT from APP.ACC where CUSTNAME='"+name+"' and custid='"+id+"' and day='"+day+"'and month='"+month+"'and yer='"+year+"'";
            }
            else if (!nameField.getText().isEmpty() && idField.getText().isEmpty() && cmbDate.getSelectedIndex()==0&& cmbMonth.getSelectedIndex()==0&& cmbYear.getSelectedIndex()==0) {
                query = "select CUSTNAME, CUSTID, DAY, MONTH, YER, SERIAL, PRODNAME, AMOUNT from APP.ACC where CUSTNAME='"+name+"'";
            }
            else if (!nameField.getText().isEmpty() && !idField.getText().isEmpty() && cmbDate.getSelectedIndex()==0&& cmbMonth.getSelectedIndex()==0&& cmbYear.getSelectedIndex()==0) {
                query = "select CUSTNAME, CUSTID, DAY, MONTH, YER, SERIAL, PRODNAME, AMOUNT from APP.ACC where CUSTNAME='"+name+"' and custid='"+id+"'";
            }
            else if (!nameField.getText().isEmpty() && idField.getText().isEmpty() && cmbDate.getSelectedIndex()!=0&& cmbMonth.getSelectedIndex()!=0&& cmbYear.getSelectedIndex()!=0) {
                query = "select CUSTNAME, CUSTID, DAY, MONTH, YER, SERIAL, PRODNAME, AMOUNT from APP.ACC where CUSTNAME='"+name+"' and day='"+day+"'and month='"+month+"'and yer='"+year+"'";
            }
            else if (nameField.getText().isEmpty() && !idField.getText().isEmpty() && cmbDate.getSelectedIndex()!=0&& cmbMonth.getSelectedIndex()!=0&& cmbYear.getSelectedIndex()!=0) {
                query = "select CUSTNAME, CUSTID, DAY, MONTH, YER, SERIAL, PRODNAME, AMOUNT from APP.ACC where custid='"+id+"' and day='"+day+"'and month='"+month+"'and yer='"+year+"'";
            }
            else if (nameField.getText().isEmpty() && !idField.getText().isEmpty() && cmbDate.getSelectedIndex()==0&& cmbMonth.getSelectedIndex()==0&& cmbYear.getSelectedIndex()==0) {
                query = "select CUSTNAME, CUSTID, DAY, MONTH, YER, SERIAL, PRODNAME, AMOUNT from APP.ACC where custid='"+id+"'";
            }
            else if (nameField.getText().isEmpty() && idField.getText().isEmpty() && cmbDate.getSelectedIndex()!=0&& cmbMonth.getSelectedIndex()!=0&& cmbYear.getSelectedIndex()!=0) {
                query = "select CUSTNAME, CUSTID, DAY, MONTH, YER, SERIAL, PRODNAME, AMOUNT from APP.ACC where day='"+day+"'and month='"+month+"'and yer='"+year+"'";
            }
            else JOptionPane.showMessageDialog(this, "No such records!");
            rs=stmtAcc.executeQuery(query);
            if(!rs.next())JOptionPane.showMessageDialog(this, "No records found!");
            rs.beforeFirst();
            while(rs.next()){
                String date=rs.getString(3).concat("-".concat(rs.getString(4).concat("-".concat(rs.getString(5)))));
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), date, rs.getString(6), rs.getString(7), rs.getString(8)});
            }
            stmtAcc.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No records found!");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        try {
            String name = nameField.getText();
            String id = idField.getText();
            String day = cmbDate.getSelectedItem().toString();
            String month = cmbMonth.getSelectedItem().toString();
            String year = cmbYear.getSelectedItem().toString();
            String strUrl = "jdbc:derby:Account;user=app;password=app";
            String query = "";
            Connection dbConnection = DriverManager.getConnection(strUrl);
            Statement stmtAcc = dbConnection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            if (!nameField.getText().isEmpty() && !idField.getText().isEmpty() && cmbDate.getSelectedIndex() != 0 && cmbMonth.getSelectedIndex() != 0 && cmbYear.getSelectedIndex() != 0) {
                query = "delete from APP.ACC where CUSTNAME='" + name + "' and custid='" + id + "' and day='" + day + "'and month='" + month + "'and yer='" + year + "'";
            } else if (!nameField.getText().isEmpty() && idField.getText().isEmpty() && cmbDate.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 0 && cmbYear.getSelectedIndex() == 0) {
                query = "delete from APP.ACC where CUSTNAME='" + name + "'";
            } else if (!nameField.getText().isEmpty() && !idField.getText().isEmpty() && cmbDate.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 0 && cmbYear.getSelectedIndex() == 0) {
                query = "delete from APP.ACC where CUSTNAME='" + name + "' and custid='" + id + "'";
            } else if (!nameField.getText().isEmpty() && idField.getText().isEmpty() && cmbDate.getSelectedIndex() != 0 && cmbMonth.getSelectedIndex() != 0 && cmbYear.getSelectedIndex() != 0) {
                query = "delete from APP.ACC where CUSTNAME='" + name + "' and day='" + day + "'and month='" + month + "'and yer='" + year + "'";
            } else if (nameField.getText().isEmpty() && !idField.getText().isEmpty() && cmbDate.getSelectedIndex() != 0 && cmbMonth.getSelectedIndex() != 0 && cmbYear.getSelectedIndex() != 0) {
                query = "delete from APP.ACC where custid='" + id + "' and day='" + day + "'and month='" + month + "'and yer='" + year + "'";
            } else if (nameField.getText().isEmpty() && !idField.getText().isEmpty() && cmbDate.getSelectedIndex() == 0 && cmbMonth.getSelectedIndex() == 0 && cmbYear.getSelectedIndex() == 0) {
                query = "delete from APP.ACC where custid='" + id + "'";
            } else if (nameField.getText().isEmpty() && idField.getText().isEmpty() && cmbDate.getSelectedIndex() != 0 && cmbMonth.getSelectedIndex() != 0 && cmbYear.getSelectedIndex() != 0) {
                query = "delete from APP.ACC where day='" + day + "'and month='" + month + "'and yer='" + year + "'";
            } else {
                JOptionPane.showMessageDialog(this, "No such records!");
            }
            stmtAcc.executeUpdate(query);
            stmtAcc.close();
            DefaultTableModel model = (DefaultTableModel) viewTable.getModel();
            model.setRowCount(0);
        } catch (SQLException ex) {
            Logger.getLogger(ViewDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_delButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DataEntry de=new DataEntry();
        this.setVisible(false);
        de.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbDate;
    private javax.swing.JComboBox cmbMonth;
    private javax.swing.JComboBox cmbYear;
    private javax.swing.JButton delButton;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables

}
