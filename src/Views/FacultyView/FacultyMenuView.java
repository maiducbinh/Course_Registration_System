/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views.FacultyView;
import Controllers.Controller;
import Models.User;
import Views.UserLoginView;

public class FacultyMenuView extends javax.swing.JFrame {
    private User user;
    /**
     * Creates new form AdminMenuView
     */
    public FacultyMenuView() {
        initComponents();
        this.user = Controller.getUser();
        idLabelShow.setText(user.getUserId()+"");
        fullnameLabelShow.setText(user.getName());
        usernameLabelShow.setText(user.getUsername());
        phoneLabelShow.setText(user.getPhone());
        emailLabelShow.setText(user.getEmail());
        setLocationRelativeTo(this);
        setTitle("Faculty's Menu");
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
        IdLabelTitle = new javax.swing.JLabel();
        idLabelShow = new javax.swing.JLabel();
        usernameLabelShow = new javax.swing.JLabel();
        usernameLabelTitle = new javax.swing.JLabel();
        fullnameLabelShow = new javax.swing.JLabel();
        fullnameLabelTitle = new javax.swing.JLabel();
        phoneLabelShow = new javax.swing.JLabel();
        phoneLabelTitle = new javax.swing.JLabel();
        emailLabelTitle = new javax.swing.JLabel();
        emailLabelShow = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        editStudentBtn = new javax.swing.JButton();
        registerWithdrawFacultyBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IdLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        IdLabelTitle.setText("FacultyID:");

        idLabelShow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idLabelShow.setText("jLabel3");

        usernameLabelShow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usernameLabelShow.setText("jLabel3");

        usernameLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usernameLabelTitle.setText("Username:");

        fullnameLabelShow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fullnameLabelShow.setText("jLabel3");

        fullnameLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fullnameLabelTitle.setText("Fullname:");

        phoneLabelShow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        phoneLabelShow.setText("jLabel3");

        phoneLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        phoneLabelTitle.setText("Phone:");

        emailLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emailLabelTitle.setText("Email:");

        emailLabelShow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        emailLabelShow.setText("jLabel3");

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logoutBtn.setText("LogOut");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        editStudentBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editStudentBtn.setText("Edit Information");
        editStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentBtnActionPerformed(evt);
            }
        });

        registerWithdrawFacultyBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registerWithdrawFacultyBtn.setText("Register - Withdraw Course");
        registerWithdrawFacultyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerWithdrawFacultyBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Faculty's Information");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IdLabelTitle)
                                    .addComponent(usernameLabelTitle)
                                    .addComponent(fullnameLabelTitle)
                                    .addComponent(phoneLabelTitle)
                                    .addComponent(emailLabelTitle))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameLabelShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idLabelShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fullnameLabelShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(phoneLabelShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailLabelShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(registerWithdrawFacultyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(logoutBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(editStudentBtn)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdLabelTitle)
                    .addComponent(idLabelShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabelTitle)
                    .addComponent(usernameLabelShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullnameLabelTitle)
                    .addComponent(fullnameLabelShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabelTitle)
                    .addComponent(phoneLabelShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabelTitle)
                    .addComponent(emailLabelShow))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutBtn)
                    .addComponent(editStudentBtn))
                .addGap(18, 18, 18)
                .addComponent(registerWithdrawFacultyBtn)
                .addGap(17, 17, 17))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        this.dispose();
        new UserLoginView().setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void editStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new FacultyEditInformationView().setVisible(true);
    }//GEN-LAST:event_editStudentBtnActionPerformed

    private void registerWithdrawFacultyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerWithdrawFacultyBtnActionPerformed
        // TODO add your handling code here:
         this.dispose();
        new FacultyRegisterWithdrawCourseView().setVisible(true);
    }//GEN-LAST:event_registerWithdrawFacultyBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FacultyMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultyMenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdLabelTitle;
    private javax.swing.JButton editStudentBtn;
    private javax.swing.JLabel emailLabelShow;
    private javax.swing.JLabel emailLabelTitle;
    private javax.swing.JLabel fullnameLabelShow;
    private javax.swing.JLabel fullnameLabelTitle;
    private javax.swing.JLabel idLabelShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel phoneLabelShow;
    private javax.swing.JLabel phoneLabelTitle;
    private javax.swing.JButton registerWithdrawFacultyBtn;
    private javax.swing.JLabel usernameLabelShow;
    private javax.swing.JLabel usernameLabelTitle;
    // End of variables declaration//GEN-END:variables
}
