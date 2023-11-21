# Course Registration System

This repository contains the source code for the major project of Object-Oriented Programming (OOP) course focusing on a Course Registration System. The system is designed to facilitate the management of courses and user accounts within an educational institution.

## Features

- **Admin Functionality:**
  - Create, edit, and delete courses.
  - Manage user accounts for students and faculty members.

- **Student and Faculty Actions:**
  - Students and faculty can register for courses.
  - Withdraw from enrolled courses.

## Technologies Used

- **Programming Language:** Java
- **Database:** MySQL

## How to Use

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/maiducbinh/course-registration-system.git
   ```

2. **Set up the Database:**
   - Create a MySQL database.
   - Configure the database connection in `src/config.properties`:
     ```properties
     db.url=jdbc:mysql://localhost:3306/your_database
     db.username=your_username
     db.password=your_password
     ```

3. **Run the Application:**
   - Compile and run the Java code to start the Course Registration System.

4. **Administrator Access:**
   - Use the admin credentials to access administrative functions.

5. **User Accounts:**
   - Create student and faculty accounts for course registration.

## Folder Structure

- `src/`: Contains the Java source code.
- `sql/`: SQL scripts for database setup and initialization.
- `docs/`: Documentation related to the project.

## Dependencies

- Java 8 or higher
- MySQL

## Contributing

If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.
