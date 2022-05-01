/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.main;

import Business.RailCompany.RailCrew;
import Business.RailCompany.RailCompany;
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
//        system = ConfigureASystem.configure();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1000,600);
        for(RailCompany rc : system.getRailCompanyDirectory().getRailCompanyList()){
            if(rc.getRailCrewList()==null){
                continue;
            }else{
                for(RailCrew ac : rc.getRailCrewList()){
                    System.out.println(ac);
                }
            }
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        loginJLabel = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        mainScreen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btnLogin.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(62, 80, 170));
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtUserName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserName.setBorder(null);

        txtPwd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPwd.setBorder(null);

        btnLogout.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(62, 80, 170));
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.setEnabled(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Name");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password.png"))); // NOI18N

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setFont(new java.awt.Font("BM Hanna 11yrs Old", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 153, 102));
        jTextField1.setText("Welcome");
        jTextField1.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginJLabel)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)))
                .addGap(12, 12, 12)
                .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginJLabel)
                .addGap(50, 50, 50)
                .addComponent(btnLogin)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        mainScreen.setBackground(new java.awt.Color(255, 255, 255));
        mainScreen.setPreferredSize(new java.awt.Dimension(600, 500));
        mainScreen.setSize(new java.awt.Dimension(800, 600));
        mainScreen.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/homepage1.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 360));
        mainScreen.add(jLabel1, "card2");

        jSplitPane1.setRightComponent(mainScreen);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        btnLogout.setEnabled(false);
        txtUserName.setEnabled(true);
        txtPwd.setEnabled(true);
        btnLogin.setEnabled(true);

        txtUserName.setText("");
        txtPwd.setText("");

        mainScreen.removeAll();
        JPanel blankJP = new JPanel();
        mainScreen.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) mainScreen.getLayout();
        crdLyt.next(mainScreen);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Get user name
        String userName = txtUserName.getText();
        // Get Password
        char[] passwordCharArray = txtPwd.getPassword();
        String password = String.valueOf(passwordCharArray);
        boolean flag = false;

        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        if (userAccount != null){
            mainScreen.add("RoleJPanel",userAccount.getRole().createWorkArea(mainScreen,userAccount,system));
            CardLayout layout = (CardLayout) mainScreen.getLayout();
            layout.next(mainScreen);
            flag = true;
        }
        if (flag == false) {
            JOptionPane.showMessageDialog(null, "Invalid User Name/ Password.");
            txtUserName.setText("");
            txtPwd.setText("");
            return;
        }
        btnLogout.setEnabled(true);
        txtUserName.setEnabled(false);
        txtPwd.setEnabled(false);
        btnLogin.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JPanel mainScreen;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
