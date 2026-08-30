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

    }
}
