package Views.AdminView;

import Controllers.Controller;
import Controllers.ValidException;
import Models.User;
import javax.swing.JOptionPane;

public class AdminEditInformationView extends javax.swing.JFrame {

    private User user;

    /**
     * Creates new form AdminMenuView
     */
    public AdminEditInformationView() {
        initComponents();
        user = Controller.getUser();
        usernameFieldEdit.setText(user.getUsername());
        passwordFieldEdit.setText(user.getPassword());
        phoneFieldEdit.setText(user.getPhone());
        emailFieldEdit.setText(user.getEmail());
        setLocationRelativeTo(this);
        setTitle("Edit Information");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        usernameLabelEdit = new javax.swing.JLabel();
        passwordLabelEdit = new javax.swing.JLabel();
        phoneLabelEdit = new javax.swing.JLabel();
        emailLabelEdit = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        doneEditAdminBtn = new javax.swing.JButton();
        backEditAdminBtn = new javax.swing.JButton();
        usernameFieldEdit = new javax.swing.JTextField();
        emailFieldEdit = new javax.swing.JTextField();
        phoneFieldEdit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        confirm = new javax.swing.JPasswordField();
        passwordFieldEdit = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameLabelEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameLabelEdit.setText("Username:");

        passwordLabelEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordLabelEdit.setText("Password:");

        phoneLabelEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneLabelEdit.setText("Phone:");

        emailLabelEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailLabelEdit.setText("Email:");

        doneEditAdminBtn.setText("Done");
        doneEditAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneEditAdminBtnActionPerformed(evt);
            }
        });

        backEditAdminBtn.setText("Back");
        backEditAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backEditAdminBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(backEditAdminBtn)
                .addGap(83, 83, 83)
                .addComponent(doneEditAdminBtn)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backEditAdminBtn)
                    .addComponent(doneEditAdminBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        usernameFieldEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        emailFieldEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        phoneFieldEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Confirm password:");

        confirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        passwordFieldEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(phoneLabelEdit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(usernameLabelEdit)
                                .addGap(86, 86, 86)
                                .addComponent(usernameFieldEdit))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordLabelEdit)
                                    .addComponent(jLabel1)
                                    .addComponent(emailLabelEdit))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailFieldEdit)
                                    .addComponent(confirm)
                                    .addComponent(phoneFieldEdit)
                                    .addComponent(passwordFieldEdit))))
                        .addGap(28, 28, 28))))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabelEdit)
                    .addComponent(usernameFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabelEdit)
                    .addComponent(passwordFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabelEdit)
                    .addComponent(phoneFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabelEdit))
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doneEditAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneEditAdminBtnActionPerformed
        // TODO add your handling code here:
        try {
            String newUsername = usernameFieldEdit.getText();
            String newPassword = String.valueOf(passwordFieldEdit.getPassword());
            String confirmPassword = String.valueOf(confirm.getPassword());
            if (!newPassword.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Password and confirm password do not match. Please re-enter.");
                return;
            }
            String newPhone = phoneFieldEdit.getText();
            if (!newPhone.matches("\\d+")) {
                throw new ValidException("Re_enter phone number!");
            }
            String newEmail = emailFieldEdit.getText();
            user.setUsername(newUsername.trim());
            user.setPassword(newPassword.trim());
            user.setPhone(newPhone.trim());
            user.setEmail(newEmail.trim());
            Controller.userEditController(user, this);
        } catch (ValidException ex) {
            JOptionPane.showMessageDialog(this, ex);
            phoneFieldEdit.setText("");
            phoneFieldEdit.requestFocus();
        }
    }//GEN-LAST:event_doneEditAdminBtnActionPerformed

    private void backEditAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backEditAdminBtnActionPerformed
        this.dispose();
        new AdminMenuView().setVisible(true);
    }//GEN-LAST:event_backEditAdminBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminEditInformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEditInformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEditInformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEditInformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEditInformationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backEditAdminBtn;
    private javax.swing.JPasswordField confirm;
    private javax.swing.JButton doneEditAdminBtn;
    private javax.swing.JTextField emailFieldEdit;
    private javax.swing.JLabel emailLabelEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField passwordFieldEdit;
    private javax.swing.JLabel passwordLabelEdit;
    private javax.swing.JTextField phoneFieldEdit;
    private javax.swing.JLabel phoneLabelEdit;
    private javax.swing.JTextField usernameFieldEdit;
    private javax.swing.JLabel usernameLabelEdit;
    // End of variables declaration//GEN-END:variables
}
