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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quan's PC
 */
public class AdminManipulateCourseView extends javax.swing.JFrame implements View{

    private List<Course> courseList;
    DefaultTableModel dtmCourseList;
    /**
     * Creates new form AdminMenuView
     */
    public AdminManipulateCourseView() {
        initComponents();
        renderTable(Course_Model.getAllCourses(""));
        setLocationRelativeTo(this);
        setTitle("Course Manipulations");
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
    
    public void emptyAllField(){
        courseIdFieldCreate.setText("");
        courseNameFieldCreate.setText("");
        courseCreditsFieldCreate.setText("");
        courseMaxStudentFieldCreate.setText("");
        courseLocationFieldCreate.setText("");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        adminCourseListTable = new javax.swing.JTable();
        viewCoursesTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        couseIdLabelTitle = new javax.swing.JLabel();
        courseIdFieldFind = new javax.swing.JTextField();
        EditCourseBtn = new javax.swing.JButton();
        deleteCourseBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        courseIdFieldCreate = new javax.swing.JTextField();
        CourseIdLabelTitle = new javax.swing.JLabel();
        createCouresBtn = new javax.swing.JButton();
        courseNameLabelTitle = new javax.swing.JLabel();
        courseNameFieldCreate = new javax.swing.JTextField();
        courseCreditsFieldCreate = new javax.swing.JTextField();
        courseCreditsLabelTitle = new javax.swing.JLabel();
        courseMaxStudentLabelTitle = new javax.swing.JLabel();
        courseMaxStudentFieldCreate = new javax.swing.JTextField();
        courseLocationLabelTitle = new javax.swing.JLabel();
        courseLocationFieldCreate = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        backCreateCourseBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminCourseListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "idx", "Course_Id", "Course_name", "Course_credits", "Course_maxStudents", "Course_location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(adminCourseListTable);

        couseIdLabelTitle.setText("CourseID:");

        courseIdFieldFind.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        EditCourseBtn.setText("Edit");
        EditCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCourseBtnActionPerformed(evt);
            }
        });

        deleteCourseBtn.setText("Delete");
        deleteCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCourseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(couseIdLabelTitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(courseIdFieldFind, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(EditCourseBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteCourseBtn)
                        .addGap(64, 64, 64))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(couseIdLabelTitle)
                    .addComponent(courseIdFieldFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteCourseBtn)
                    .addComponent(EditCourseBtn))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        viewCoursesTabbedPane.addTab("Course Managements", jPanel2);

        courseIdFieldCreate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        CourseIdLabelTitle.setText("CourseID:");

        createCouresBtn.setText("Create");
        createCouresBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCouresBtnActionPerformed(evt);
            }
        });

        courseNameLabelTitle.setText("Course Name:");

        courseNameFieldCreate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        courseCreditsFieldCreate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        courseCreditsLabelTitle.setText("Course Credits:");

        courseMaxStudentLabelTitle.setText("Max Students:");

        courseMaxStudentFieldCreate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        courseLocationLabelTitle.setText("Course Location:");

        courseLocationFieldCreate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseCreditsLabelTitle)
                            .addComponent(courseNameLabelTitle)
                            .addComponent(CourseIdLabelTitle)
                            .addComponent(courseMaxStudentLabelTitle)
                            .addComponent(courseLocationLabelTitle))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseIdFieldCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(courseNameFieldCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(courseCreditsFieldCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(courseMaxStudentFieldCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(courseLocationFieldCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(createCouresBtn)))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseIdFieldCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseIdLabelTitle))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseNameFieldCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseNameLabelTitle))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseCreditsFieldCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseCreditsLabelTitle))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseMaxStudentFieldCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseMaxStudentLabelTitle))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseLocationFieldCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseLocationLabelTitle))
                .addGap(18, 18, 18)
                .addComponent(createCouresBtn)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        viewCoursesTabbedPane.addTab("Course Creation", jPanel3);

        backCreateCourseBtn.setText("Back");
        backCreateCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backCreateCourseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backCreateCourseBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backCreateCourseBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewCoursesTabbedPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewCoursesTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createCouresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCouresBtnActionPerformed
        // TODO add your handling code here:
        try{
        String courseId = courseIdFieldCreate.getText();
        String courseName = courseNameFieldCreate.getText();
        String courseCredits = courseCreditsFieldCreate.getText();
        String courseMaxstudent = courseMaxStudentFieldCreate.getText();
        String courseLocation = courseLocationFieldCreate.getText();
        Course course = new Course(courseId.trim(), courseName.trim(), Integer.parseInt(courseCredits.trim()), courseLocation.trim(), Integer.parseInt(courseMaxstudent.trim()));
        Controller.courseCreateController(course, this);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Input number only!");
            courseCreditsFieldCreate.setText("");
            courseMaxStudentFieldCreate.setText("");
            courseCreditsFieldCreate.requestFocus();
        }
    }//GEN-LAST:event_createCouresBtnActionPerformed

    private void backCreateCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backCreateCourseBtnActionPerformed
        // TODO add your handling code here:
         this.dispose();
        new AdminMenuView().setVisible(true);
    }//GEN-LAST:event_backCreateCourseBtnActionPerformed

    private void EditCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCourseBtnActionPerformed
        // TODO add your handling code here:
        String courseId = courseIdFieldFind.getText();
        Controller.courseEditFindIdController(courseId, this);
        
    }//GEN-LAST:event_EditCourseBtnActionPerformed

    private void deleteCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCourseBtnActionPerformed
        // TODO add your handling code here:
        String courseId = courseIdFieldFind.getText();
        Controller.courseDeleteController(courseId, this);
    }//GEN-LAST:event_deleteCourseBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminManipulateCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminManipulateCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminManipulateCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminManipulateCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AdminManipulateCourseView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CourseIdLabelTitle;
    private javax.swing.JButton EditCourseBtn;
    private javax.swing.JTable adminCourseListTable;
    private javax.swing.JButton backCreateCourseBtn;
    private javax.swing.JTextField courseCreditsFieldCreate;
    private javax.swing.JLabel courseCreditsLabelTitle;
    private javax.swing.JTextField courseIdFieldCreate;
    private javax.swing.JTextField courseIdFieldFind;
    private javax.swing.JTextField courseLocationFieldCreate;
    private javax.swing.JLabel courseLocationLabelTitle;
    private javax.swing.JTextField courseMaxStudentFieldCreate;
    private javax.swing.JLabel courseMaxStudentLabelTitle;
    private javax.swing.JTextField courseNameFieldCreate;
    private javax.swing.JLabel courseNameLabelTitle;
    private javax.swing.JLabel couseIdLabelTitle;
    private javax.swing.JButton createCouresBtn;
    private javax.swing.JButton deleteCourseBtn;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane viewCoursesTabbedPane;
    // End of variables declaration//GEN-END:variables
}
