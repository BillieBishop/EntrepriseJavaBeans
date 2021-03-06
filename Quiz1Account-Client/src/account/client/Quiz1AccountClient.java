
package account.client;

import account.ejb.Operation;
import account.ejb.Quiz1AccountServiceRemote;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JOptionPane;


public class Quiz1AccountClient extends javax.swing.JFrame {
    
    Quiz1AccountServiceRemote accountService;
    
    public Quiz1AccountClient() {        
        try {
            Properties props = new Properties();
            //props.load(new FileInputStream("jndi.properties"));
            props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            InitialContext ctx = new InitialContext(props);
            //accountService = (Quiz1AccountServiceRemote) ctx.lookup("account.ejb.Quiz1AccountServiceRemote");
            accountService = (Quiz1AccountServiceRemote) ctx.lookup(Quiz1AccountServiceRemote.class.getName());            
            initComponents();
        } catch (NamingException nex) {
            nex.printStackTrace();
            JOptionPane.showConfirmDialog(null, "Error connecting to GlassFish.");
            System.exit(1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnWithdrawal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        lblBalance = new javax.swing.JLabel();
        txfDeposit = new javax.swing.JTextField();
        txfWithdrawal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Account balance :");

        jLabel2.setText("Make deposit :");

        jLabel3.setText("Make withdrawal :");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnWithdrawal.setText("Withdrawal");
        btnWithdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawalActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        lblBalance.setText("jLabel4");

        txfDeposit.setText("jTextField1");

        txfWithdrawal.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txfWithdrawal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnWithdrawal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnRefresh)
                            .addComponent(lblBalance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeposit)
                            .addComponent(jLabel2)))
                    .addComponent(txfDeposit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWithdrawal)
                    .addComponent(jLabel3)
                    .addComponent(txfWithdrawal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        // FIXME balance must reflect the real balance
        //I need to pee NOW
        double amount = 0;
        double balance = 0;
        
        try{
            amount = Double.parseDouble(txfDeposit.getText());
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        balance += amount;
        String balanceString = String.valueOf(balance);
        lblBalance.setText(balanceString);
        
        try{
            ArrayList<Operation> operationList = accountService.getAllOperations();
            for (Operation o : operationList){                
                System.out.printf("Deposited %s on %s\n", o.amount.toString(), o.date);
            }
        }catch(RuntimeException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnWithdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawalActionPerformed
        // FIXME balance must reflect the real balance
        double amount = 0;
        double balance = 0;
        
        try{
            amount = Double.parseDouble(txfWithdrawal.getText());
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        balance -= amount;
        String balanceString = String.valueOf(balance);
        lblBalance.setText(balanceString);
        
        try{
            ArrayList<Operation> operationList = accountService.getAllOperations();
            for (Operation o : operationList){                
                System.out.printf("Withdrew %s on %s\n", o.amount.toString(), o.date);
            }
        }catch(RuntimeException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnWithdrawalActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        //Then add it at the right place
        try{
            ArrayList<Operation> operationList = accountService.getAllOperations();
            for (Operation o : operationList){
                //FIXME: Next line. I would need to pee NOW, can't think through... 
                //FIXME: Still have 5 minutes
                //System.out.printf("%s on %s\n", o.amount.toString(), o.);
            }
        }catch(RuntimeException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    /**
     * @param args the command line arguments
     */
    
    static Scanner input = new Scanner(System.in);
    
    
    
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Quiz1AccountClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz1AccountClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz1AccountClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz1AccountClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz1AccountClient().setVisible(true);
            }
        });
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnWithdrawal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JTextField txfDeposit;
    private javax.swing.JTextField txfWithdrawal;
    // End of variables declaration//GEN-END:variables
}
