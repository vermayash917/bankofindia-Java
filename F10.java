/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * F10.java
 *
 * Created on 15 Aug, 2017, 7:34:29 PM
 */

package Bank;



import java.sql.*;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author iayushag
 */
public class F10 extends javax.swing.JFrame {

    /** Creates new form F10 */
    public F10() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        op1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        acn = new javax.swing.JTextField();
        nm = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        wi = new javax.swing.JRadioButton();
        de = new javax.swing.JRadioButton();
        am1 = new javax.swing.JTextField();
        am = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Enter A/C Num");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Enter Name");

        label2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 153, 0));
        label2.setText("UPDATE LOAN OF A ACCOUNT");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Loan ");

        buttonGroup1.add(wi);
        wi.setForeground(new java.awt.Color(51, 51, 255));
        wi.setText("WITHDRAWN");
        wi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wiActionPerformed(evt);
            }
        });

        buttonGroup1.add(de);
        de.setForeground(new java.awt.Color(51, 51, 255));
        de.setText("DEPOSITED");
        de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setText("UPDATE LOAN");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("Enter Amount deposited/withdrawn");

        back.setBackground(new java.awt.Color(102, 153, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        back.setForeground(new java.awt.Color(102, 102, 0));
        back.setText("<---");
        back.setBorder(null);
        back.setFocusCycleRoot(true);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Century Schoolbook", 1, 60)); // NOI18N
        label1.setForeground(new java.awt.Color(51, 51, 255));
        label1.setText("Bank Of India");

        jButton6.setBackground(new java.awt.Color(204, 255, 255));
        jButton6.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jButton6.setText("Sign Out");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 153, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton9.setText("X");
        jButton9.setBorder(new javax.swing.border.MatteBorder(null));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(am))
                            .addComponent(wi))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(de)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(am1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(acn, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))
                .addGap(4, 4, 4))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 556, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(acn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(247, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wi)
                            .addComponent(de))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(am1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("static-access")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String name=nm.getText();
       String ac=acn.getText();
       String dep=am.getText();
       String wit=wi.getText();
                if(name.isEmpty()){
                                   op1.showMessageDialog(null,"Name is Empty");
                                  }
                if(ac.isEmpty()){
                                   op1.showMessageDialog(null,"Enter Account num ");
                                     }


       try{
               Class.forName("java.sql.DriverManager");
               Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bankofind","root","root");
               Statement stmt= (Statement) con.createStatement();
               String query="Select*from bankdataac where Name='"+name+"'and Acc_no='"+ac+"';";
               ResultSet rs=stmt.executeQuery(query);
              if(rs.next()){
                            try{
                               Class.forName("java.sql.DriverManager");
                               Connection con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bankofind","root","root");
                               Statement stmt1= (Statement) con1.createStatement();
                      if(de.isSelected()){
                           if(dep.isEmpty()){
                                   op1.showMessageDialog(null,"Deposite account is not entered");
                                     }
                           else{
                                  String query1="update Bankdata SET Loan=Loan-'"+dep+"' where Acc_no='"+ac+"';";
                                  stmt1.executeUpdate(query1);
                               }
                                       }
                 else if(wi.isSelected()){
                                if(wit.isEmpty()){
                                   op1.showMessageDialog(null,"Withrawing Account is not entered");
                                                 }
                                      else{
                                    String query1="update Bankdata SET Loan=Loan+'"+wit+"' where Acc_no='"+ac+"';";
                                    stmt1.executeUpdate(query1);
                                          }
                                         }
                 op1.showMessageDialog(null,"Loan Updated");
                }
            catch(Exception e)
                    {
                   op1.showMessageDialog(this,e.getMessage());
                    }
                         }
              else{
                   op1.showMessageDialog(null,"No such name or account");              
                  }
                     }
                  catch(Exception e)
                      {
                     op1.showMessageDialog(this,e.getMessage());
                      }
                 

    }//GEN-LAST:event_jButton1ActionPerformed

    private void deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deActionPerformed
        // TODO add your handling code here:
        am.setVisible(false);
        am1.setVisible(true);
    }//GEN-LAST:event_deActionPerformed

    private void wiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wiActionPerformed
        // TODO add your handling code here:
        am1.setVisible(false);
        am.setVisible(true);
    }//GEN-LAST:event_wiActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        F4 r= new F4();
        r.setVisible(true);
        this.dispose();
}//GEN-LAST:event_backActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        F1_Login f=new F1_Login();
        f.setVisible(true);
        this.dispose();
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
}//GEN-LAST:event_jButton9ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acn;
    private javax.swing.JTextField am;
    private javax.swing.JTextField am1;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton de;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JTextField nm;
    private javax.swing.JOptionPane op1;
    private javax.swing.JRadioButton wi;
    // End of variables declaration//GEN-END:variables

}
