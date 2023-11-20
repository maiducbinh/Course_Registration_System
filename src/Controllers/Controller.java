/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Course;
import Models.Course_Model;
import Models.User;
import Models.User_Model;
import Views.AdminView.*;
import Views.CourseView.CourseEditInformationView;
import Views.FacultyView.FacultyMenuView;
import Views.StudentView.StudentMenuView;
import Views.View;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Quan's PC
 */
public class Controller {

    private static User user;

    public static User getUser() {
        return user;
    }

    public static void userLoginController(String username, String password, JFrame frame) {
        user = User_Model.getUserByUsernamePassword(username, password);
        if (user == null) {
            JOptionPane.showMessageDialog(frame, "Re-enter your password");
            return;
        }
        frame.dispose();
        String userRole = getUser().getUserRole();

        if ("admin".equals(userRole)) {
            new AdminMenuView().setVisible(true);
        } else if ("faculty".equals(userRole)) {
            new FacultyMenuView().setVisible(true);
        } else {
            new StudentMenuView().setVisible(true);
        }
    }

    public static void userEditController(User newUser, JFrame jFrame) {
        if (newUser.getUsername().isBlank() || newUser.getPassword().isBlank()) {
            System.out.println("Failed to update user information");
            return;
        }
        String userRole = getUser().getUserRole();
        jFrame.dispose();
        User_Model.updateUser(newUser);
        Controller.user = newUser;
        if ("admin".equals(userRole)) {
            new AdminMenuView().setVisible(true);
        } else if ("faculty".equals(userRole)) {
            new FacultyMenuView().setVisible(true);
        } else {
            new StudentMenuView().setVisible(true);
        }
    }

    public static void courseCreateController(Course newcourse, AdminManipulateCourseView jFrame) {
        if (newcourse.getCourseId().isBlank() || newcourse.getCourseName().isBlank()) {
            System.out.println("Failed to create course");
            return;
        }
        Course_Model.insertCourse(newcourse);
        jFrame.emptyAllField();
        jFrame.renderTable(Course_Model.getAllCourses(""));
    }

    public static void courseEditFindIdController(String courseId, JFrame jFrame) {
        Course course = Course_Model.getCourseById(courseId.trim());
        if (course == null) {
            System.out.println("No course found");
            return;
        }
        CourseEditInformationView courseEditInformationView = new CourseEditInformationView();
        courseEditInformationView.setCourse(course);
        jFrame.dispose();
        courseEditInformationView.setVisible(true);

    }

    public static void courseEditController(Course newCourse) {
        if (Course_Model.updateCourse(newCourse)) {
            System.out.println("Course success update");
        } else {
            System.out.println("Course failed to update");
        }
        new AdminManipulateCourseView().setVisible(true);
    }

    public static void courseDeleteController(String courseId, View jFrame) {
        if (Course_Model.deleteCourse(courseId)) {
            System.out.println("Course success delete");
        } else {
            System.out.println("Course failed to delete");
        }
        jFrame.renderTable(Course_Model.getAllCourses(""));
    }

    public static void userRegisterFacultyController(User newFaculty, JFrame jFrame) {
        if (newFaculty.getName().isBlank() || newFaculty.getUsername().isBlank() || newFaculty.getPassword().isBlank()) {
            System.out.println("Failed to register faculty");
            return;
        }
        User_Model.insertUser(newFaculty);
        jFrame.dispose();
        new AdminMenuView().setVisible(true);
    }

    public static void userRegisterStudentController(User newStudent, JFrame jFrame) {
        if (newStudent.getName().isBlank() || newStudent.getUsername().isBlank() || newStudent.getPassword().isBlank()) {
            System.out.println("Failed to register student");
            return;
        }
        User_Model.insertUser(newStudent);
        jFrame.dispose();
        new AdminMenuView().setVisible(true);
    }

    public static void adminViewCourseByIdController(String courseId, boolean isFull, AdminViewCourseView jFrame) {
        List<Course> courses = new ArrayList<>();
        if (isFull) {
            courses = Course_Model.getCoursesAsStatus(isFull, getUser().getUserRole());
            courses = courses.stream().filter(course -> course.getCourseId().contains(courseId)).toList();
        } else {
            courses = Course_Model.getAllCourses(courseId.trim());
        }

        jFrame.renderTable(courses);
    }

    public static void userViewCourseByIdController(String courseId, boolean status, View jFrame) {
        // Course that see by student and faculty
        List<Course> courses = Course_Model.getCoursesAsStatus(status, getUser().getUserRole());
        courses = courses.stream().filter(course -> course.getCourseId().contains(courseId)).toList();

        if ("admin".equals(getUser().getUserRole()) && !status) // Course that see bt Admin
        {
            courses = Course_Model.getAllCourses(courseId.trim());
        }

        jFrame.renderTable(courses);
    }

    public static void userViewRegisterCourseController(String userId, String userRole, String courseId, View jFrame) {
        if (userId.isBlank() || User_Model.getUserById(Integer.parseInt(userId.trim())) == null) {
            System.out.println("No user found");
            return;
        }

        jFrame.renderTable(Course_Model.getCoursesByUserId(Integer.parseInt(userId.trim()), userRole, courseId));
    }

    public static void viewRegisterUserByCourseIdController(String courseId, View jFrame) {
        if (courseId.isBlank() || Course_Model.getCourseById(courseId.trim()) == null) {
            System.out.println("No course found");
            return;
        }

        jFrame.renderTable(User_Model.getStudentByCourseId(courseId));
    }

    public static void userRegisterByCourseIdController(String courseId) {
        List<Course> listCourse = Course_Model.getCoursesByUserId(getUser().getUserId(), getUser().getUserRole(), courseId);
        if (!listCourse.isEmpty()) {
            System.out.println(getUser().getUserRole() + " has already registered this course!");
            return;
        }
        if (Course_Model.addUserToCourse(getUser().getUserId(), getUser().getUserRole(), courseId)) {
            System.out.println("Successfull register " + getUser().getUserRole());
        } else {
            System.out.println("Failed to register " + getUser().getUserRole());
        }
    }

    public static void userWithdrawByCourseIdController(String courseId) {
        List<Course> listCourse = Course_Model.getCoursesByUserId(getUser().getUserId(), getUser().getUserRole(), courseId);
        if (listCourse.isEmpty()) {
            System.out.println(getUser().getUserRole() + " has not registered this course!");
            return;
        }
        if (Course_Model.deleteUserFromCourse(getUser().getUserId(), getUser().getUserRole(), courseId)) {
            System.out.println("Successfull withdraw " + getUser().getUserRole());
        } else {
            System.out.println("Failed to withdraw " + getUser().getUserRole());
        }
    }

}
