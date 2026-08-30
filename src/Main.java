import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        //Attributes
        //C - Course
        String CName, CLocation, CID;
        int CCapacity;

        //S - Student
        String SName, SEmail, SID, SYear;

        List<Course> courselist = new ArrayList<>();//List of Courses the user creates in the main class
        List<Student> studentlist = new ArrayList<>();//List of Students the user creates in the main class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Course Enrollment System!");
        System.out.println("Please enter the number of courses you would like to create 0 to exit: ");
        int numCourses = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter details for Course " + (i + 1) + ":");
            System.out.print("Name: ");
            CName = scanner.nextLine();
            System.out.print("Location: ");
            CLocation = scanner.nextLine();
            System.out.print("ID: ");
            CID = scanner.nextLine();
            System.out.print("Capacity: ");
            CCapacity = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            Course course = new Course(CName, CLocation, CID, CCapacity);
            courselist.add(course);
        }
        /*
        //Debugging: Display all courses created
        for (Course c : courselist) {
            c.CourseInfo();
        }
        //Debugging: Display all courses created
        */

        System.out.println("Please enter the number of students you would like to create 0 to exit: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            SName = scanner.nextLine();
            System.out.print("Email: ");
            SEmail = scanner.nextLine();
            System.out.print("ID: ");
            SID = scanner.nextLine();
            System.out.print("Year: ");
            SYear = scanner.nextLine();

            Student student = new Student(SName, SEmail, SID, SYear);
            studentlist.add(student);
        }
        /*
        //Debugging: Display all students created
        for (Student s : studentlist) {
            s.StudentInfo();
        }
        //Debugging: Display all students created
        */

        while (true) { //Continue looping until the user types "exit" to finish enrolling students in courses
            System.out.println("Enter name or ID of the course to enroll students in (or type 'exit' to finish):");
            String courseIdentifier = scanner.nextLine();
            if (courseIdentifier.equalsIgnoreCase("exit")) { //Exit the loop if the user types "exit"
                break;
            }
            Course selectedCourse = null; //Set currently selected course to null, will be updated if a course is found
            for (Course c : courselist) { //Loop through the list of courses and check if the user input matches a course's name or ID
                if (c.getName().equalsIgnoreCase(courseIdentifier) || c.getID().equalsIgnoreCase(courseIdentifier)) {
                    selectedCourse = c;
                    break;
                }
            }
            if (selectedCourse == null) {//If no course is found, print an error message and continue the loop
                System.out.println("Course not found. Please try again.");
                continue;
            }

            while (true) { //Continue looping until the user types "exit" to finish enrolling students in the selected course
                System.out.println("Enter name or ID of the student to enroll in " + selectedCourse.getName() + " (or type 'exit' to finish):");
                String studentIdentifier = scanner.nextLine();
                if (studentIdentifier.equalsIgnoreCase("exit")) {//Exit the loop if the user types "exit"
                    break;
                }

                Student selectedStudent = null; //Set currently selected student to null, will be updated if a student is found
                for (Student s : studentlist) {//Loop through the list of students and check if the user input matches a student's name or ID
                    if (s.getName().equalsIgnoreCase(studentIdentifier) || s.getID().equalsIgnoreCase(studentIdentifier)) {
                        selectedStudent = s;
                        break;
                    }
                }

                if (selectedStudent == null) { //If no student is found, print an error message and continue the loop
                    System.out.println("Student not found. Please try again.");
                    continue;
                }

                selectedCourse.addStudent(selectedStudent);//Add the selected student to the selected course
                selectedStudent.addcourse(selectedCourse);//Add the selected course to the selected student's list of courses
                System.out.println("Enrolled " + selectedStudent.getName() + " in " + selectedCourse.getName() + ".");//Print confirmation of enrollment
            }
        }
        System.out.println();
        System.out.println("Enrollment complete. Displaying course and student information:");
        for (Course c : courselist) { 
            c.Displaystudents();
        }

    }
}
