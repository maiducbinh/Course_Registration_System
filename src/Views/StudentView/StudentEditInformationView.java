/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views.StudentView;
    
import Controllers.Controller;
import Controllers.ValidException;
import Models.User;
import javax.swing.JOptionPane;

public class StudentEditInformationView extends javax.swing.JFrame {
    private User user;
    /**
     * Creates new form AdminMenuView
     */
    public StudentEditInformationView() {
        initComponents();
        user = Controller.getUser();
        usernameFieldEdit.setText(user.getUsername());
        passwordFieldEdit.setText(user.getPassword());
        phoneFieldEdit.setText(user.getPhone());
        emailFieldEdit.setText(user.getEmail());
        setLocationRelativeTo(this);
        setTitle("Edit information");
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
        usernameFieldEdit = new javax.swing.JTextField();
        emailFieldEdit = new javax.swing.JTextField();
        phoneFieldEdit = new javax.swing.JTextField();
        backEditStudentBtn = new javax.swing.JButton();
        doneEditsStudentBtn = new javax.swing.JButton();
        passwordFieldEdit = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        confirm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameLabelEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameLabelEdit.setText("Username:");

        passwordLabelEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordLabelEdit.setText("Password:");

        phoneLabelEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneLabelEdit.setText("Phone:");

        emailLabelEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailLabelEdit.setText("Email:");

        usernameFieldEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        emailFieldEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        phoneFieldEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        backEditStudentBtn.setText("Back");
        backEditStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backEditStudentBtnActionPerformed(evt);
            }
        });

        doneEditsStudentBtn.setText("Done");
        doneEditsStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneEditsStudentBtnActionPerformed(evt);
            }
        });

        passwordFieldEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Confirm Password:");

        confirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabelEdit)
                    .addComponent(passwordLabelEdit)
                    .addComponent(phoneLabelEdit)
                    .addComponent(emailLabelEdit)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(backEditStudentBtn)
                        .addGap(45, 45, 45)
                        .addComponent(doneEditsStudentBtn))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(phoneFieldEdit)
                        .addComponent(confirm)
                        .addComponent(passwordFieldEdit)
                        .addComponent(usernameFieldEdit)
                        .addComponent(emailFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabelEdit)
                    .addComponent(usernameFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabelEdit)
                    .addComponent(passwordFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabelEdit)
                    .addComponent(phoneFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabelEdit)
                    .addComponent(emailFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backEditStudentBtn)
                    .addComponent(doneEditsStudentBtn))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doneEditsStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneEditsStudentBtnActionPerformed

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
    }//GEN-LAST:event_doneEditsStudentBtnActionPerformed

    private void backEditStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backEditStudentBtnActionPerformed
        this.dispose();
        new StudentMenuView().setVisible(true);
    }//GEN-LAST:event_backEditStudentBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StudentEditInformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentEditInformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentEditInformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentEditInformationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new StudentEditInformationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backEditStudentBtn;
    private javax.swing.JPasswordField confirm;
    private javax.swing.JButton doneEditsStudentBtn;
    private javax.swing.JTextField emailFieldEdit;
    private javax.swing.JLabel emailLabelEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordFieldEdit;
    private javax.swing.JLabel passwordLabelEdit;
    private javax.swing.JTextField phoneFieldEdit;
    private javax.swing.JLabel phoneLabelEdit;
    private javax.swing.JTextField usernameFieldEdit;
    private javax.swing.JLabel usernameLabelEdit;
    // End of variables declaration//GEN-END:variables
}
