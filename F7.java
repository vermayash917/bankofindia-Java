/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * F7.java
 *
 * Created on Aug 10, 2017, 10:34:56 AM
 */

package Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Student
 */
public class F7 extends javax.swing.JFrame {

    /** Creates new form F7 */
    public F7() {
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

        op1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        submitrecordfornewcustomer = new javax.swing.JButton();
        label2 = new java.awt.Label();
        c1 = new javax.swing.JComboBox();
        d1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        acn = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        fd = new javax.swing.JTextArea();
        back = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        label1 = new java.awt.Label();

        op1.setBackground(new java.awt.Color(255, 51, 51));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Enter Name");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Enter new A/c No");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Select Branch ");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("First Deposit");

        submitrecordfornewcustomer.setFont(new java.awt.Font("Comic Sans MS", 1, 20));
        submitrecordfornewcustomer.setForeground(new java.awt.Color(51, 102, 0));
        submitrecordfornewcustomer.setText("Submit Record");
        submitrecordfornewcustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        submitrecordfornewcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitrecordfornewcustomerActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        label2.setForeground(new java.awt.Color(153, 102, 0));
        label2.setText("FOR NEW CUSTOMER");

        c1.setForeground(new java.awt.Color(51, 51, 255));
        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "vaishali_nagar", "bhankrota", "vidhyadhar_nagar", "chitrakut", "jagatpura", "tonk road" }));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setText("Enter Date(yyyy-mm-dd)");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        acn.setColumns(20);
        acn.setRows(5);
        jScrollPane1.setViewportView(acn);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        fd.setColumns(20);
        fd.setRows(5);
        jScrollPane2.setViewportView(fd);

        back.setBackground(new java.awt.Color(102, 153, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 22));
        back.setForeground(new java.awt.Color(102, 102, 0));
        back.setText("<---");
        back.setBorder(null);
        back.setFocusCycleRoot(true);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 153, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 22));
        jButton9.setText("X");
        jButton9.setBorder(new javax.swing.border.MatteBorder(null));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 255, 255));
        jButton6.setFont(new java.awt.Font("Californian FB", 1, 14));
        jButton6.setText("Sign Out");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Century Schoolbook", 1, 60));
        label1.setForeground(new java.awt.Color(51, 51, 255));
        label1.setText("Bank Of India");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(nm, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(c1, 0, 152, Short.MAX_VALUE))
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(submitrecordfornewcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(4, 4, 4)))
                .addGap(18, 18, 18)
                .addComponent(submitrecordfornewcustomer)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("static-access")
    private void submitrecordfornewcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitrecordfornewcustomerActionPerformed
        // TODO add your handling code here:
        String name=nm.getText();
        String acno=acn.getText();
        String date=d1.getText();
        String addres=add.getText();
        String first=fd.getText();
        String current="0";
        String loan="0";
        String cplace="";
        String cdate="null";
        String br="";
                 if(c1.getSelectedIndex()==0){
                 br=(String) c1.getSelectedItem();
                  }
                  if(c1.getSelectedIndex()==1){
                 br=(String) c1.getSelectedItem();
                  }
                  if(c1.getSelectedIndex()==2){
                 br=(String) c1.getSelectedItem();
                  }if(c1.getSelectedIndex()==3){
                 br=(String) c1.getSelectedItem();
                  }
                  if(c1.getSelectedIndex()==4){
                 br=(String) c1.getSelectedItem();
                  }
                  if(c1.getSelectedIndex()==5){
                 br=(String) c1.getSelectedItem();
                    }
           if(name.isEmpty()){
                        op1.showMessageDialog(null,"Name not Entered");
                             }
           else if(acno.isEmpty()){
                       op1.showMessageDialog(null,"Account num not Entered");
                          }
           else if(date.isEmpty()){
                       op1.showMessageDialog(null,"Date not Entered");
                             }
           else if(addres.isEmpty()){
                       op1.showMessageDialog(null,"Address not Entered");
                               }
           else if(first.isEmpty()){
                       op1.showMessageDialog(null,"First deposit not Entered");
                               }
           else{
                 try{
                   Class.forName("java.sql.DriverManager");
                   Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bankofind","root","root");
                   Statement stmt= (Statement) con.createStatement();
                   String query="Select*from Bankdata where Acc_no='"+acno+"';";
                   ResultSet rs=stmt.executeQuery(query);
                   if(rs.next()){
                
                         }
                else{
                  try{
                  Class.forName("java.sql.DriverManager");
                  Connection con2 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bankofind","root","root");
                  Statement stmt2= (Statement) con2.createStatement();
                  String query2="Insert into Bankdata values('"+acno+"','"+name+"','"+br+"','"+addres+"','"+first+"','"+current+"','"+loan+"');";
                  stmt2.executeUpdate(query2);
                  Statement stmt1= (Statement) con.createStatement();
                  String query1="Insert into Bankdataac values('"+acno+"','"+name+"','"+first+"','"+date+"','"+br+"','"+current+"',"+cdate+",'"+cplace+"');";
                  stmt1.executeUpdate(query1);
                 op1.showMessageDialog(null,"Record Successfully Submitted");
                     }
          catch(Exception e)
                    {
                   op1.showMessageDialog(this,e.getMessage());
                    }
                }
            }
        catch(Exception e)
                    {
                   op1.showMessageDialog(this,e.getMessage());
                    }
         

            }
}//GEN-LAST:event_submitrecordfornewcustomerActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        F4 r= new F4();
        r.setVisible(true);
        this.dispose();
}//GEN-LAST:event_backActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
}//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        F1_Login f=new F1_Login();
        f.setVisible(true);
        this.dispose();
}//GEN-LAST:event_jButton6ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea acn;
    private javax.swing.JTextField add;
    private javax.swing.JButton back;
    private javax.swing.JComboBox c1;
    private javax.swing.JTextField d1;
    private javax.swing.JTextArea fd;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JTextField nm;
    private javax.swing.JOptionPane op1;
    private javax.swing.JButton submitrecordfornewcustomer;
    // End of variables declaration//GEN-END:variables

}
