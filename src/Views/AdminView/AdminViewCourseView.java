/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views.AdminView;

import Controllers.Controller;
import Models.Course;
import Models.Course_Model;
import Views.View;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AdminViewCourseView extends javax.swing.JFrame implements View{
     private List<Course> courseList;
    DefaultTableModel dtmCourseList;
    /**
     * Creates new form AdminMenuView
     */
    public AdminViewCourseView() {
        initComponents();
        renderTable(Course_Model.getAllCourses(""));
        setLocationRelativeTo(this);
        setTitle("View Courses");
    }
    
    private void readCourses(){
        int cnt = 1;
        for(Course c : courseList){
            dtmCourseList.addRow(c.toObject(cnt++));
        }
    }
    
     @Override
    public <E> void renderTable(List<E> listCourseResult){
        dtmCourseList = (DefaultTableModel) adminCourseListTable.getModel();
        courseList = (List<Course>) listCourseResult;
        dtmCourseList.setRowCount(0);
        readCourses();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminCourseListTable = new javax.swing.JTable();
        viewCoursesTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        couseIdLabelTitle = new javax.swing.JLabel();
        courseIdFieldFind = new javax.swing.JTextField();
        fullCourseCheckBox = new javax.swing.JCheckBox();
        searchAdminListCourseBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        studentIdFieldFind = new javax.swing.JTextField();
        studentIdLabelTitle = new javax.swing.JLabel();
        searchStudentCouresBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        backViewListCourseBtn = new javax.swing.JButton();

        jLabel3.setText("StudentID:");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton3.setText("Search");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(362, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminCourseListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "idx", "Course_Id", "Course_name", "Course_credits", "Course_maxStudent", "Course_location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(adminCourseListTable);

        couseIdLabelTitle.setText("CourseID:");

        courseIdFieldFind.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        fullCourseCheckBox.setText("View Full Courses");

        searchAdminListCourseBtn.setText("Search");
        searchAdminListCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAdminListCourseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchAdminListCourseBtn)
                    .addComponent(fullCourseCheckBox)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(couseIdLabelTitle)
                        .addGap(18, 18, 18)
                        .addComponent(courseIdFieldFind, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(couseIdLabelTitle)
                    .addComponent(courseIdFieldFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(fullCourseCheckBox)
                .addGap(18, 18, 18)
                .addComponent(searchAdminListCourseBtn)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        viewCoursesTabbedPane.addTab("View Courses", jPanel2);

        studentIdFieldFind.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        studentIdLabelTitle.setText("StudentID:");

        searchStudentCouresBtn.setText("Search");
        searchStudentCouresBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentCouresBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(searchStudentCouresBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(studentIdLabelTitle)
                        .addGap(18, 18, 18)
                        .addComponent(studentIdFieldFind, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIdFieldFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentIdLabelTitle))
                .addGap(18, 18, 18)
                .addComponent(searchStudentCouresBtn)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        viewCoursesTabbedPane.addTab("View Student Register Courses", jPanel3);

        backViewListCourseBtn.setText("Back");
        backViewListCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backViewListCourseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(backViewListCourseBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(backViewListCourseBtn)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewCoursesTabbedPane)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewCoursesTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backViewListCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backViewListCourseBtnActionPerformed
        // TODO add your handling code here:
         this.dispose();
        new AdminMenuView().setVisible(true);
    }//GEN-LAST:event_backViewListCourseBtnActionPerformed

    private void searchAdminListCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAdminListCourseBtnActionPerformed
        // TODO add your handling code here:
        studentIdFieldFind.setText("");
        String courseId = courseIdFieldFind.getText();
        boolean isFull = fullCourseCheckBox.isSelected();
        Controller.userViewCourseByIdController(courseId, isFull, this);
    }//GEN-LAST:event_searchAdminListCourseBtnActionPerformed

    private void searchStudentCouresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentCouresBtnActionPerformed
        // TODO add your handling code here:
        courseIdFieldFind.setText("");
        fullCourseCheckBox.setSelected(false);
        String studentId = studentIdFieldFind.getText();
        Controller.userViewRegisterCourseController(studentId, "student","" ,this);
    }//GEN-LAST:event_searchStudentCouresBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminViewCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewCourseView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable adminCourseListTable;
    private javax.swing.JButton backViewListCourseBtn;
    private javax.swing.JTextField courseIdFieldFind;
    private javax.swing.JLabel couseIdLabelTitle;
    private javax.swing.JCheckBox fullCourseCheckBox;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton searchAdminListCourseBtn;
    private javax.swing.JButton searchStudentCouresBtn;
    private javax.swing.JTextField studentIdFieldFind;
    private javax.swing.JLabel studentIdLabelTitle;
    private javax.swing.JTabbedPane viewCoursesTabbedPane;
    // End of variables declaration//GEN-END:variables
}
