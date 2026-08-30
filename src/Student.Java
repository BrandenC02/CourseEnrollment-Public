
import java.util.ArrayList;
import java.util.List;


public class Student {
    //Attributes
    private String Name;
    private String ID;
    private String Email;
    private String Year;

    //Student Constructor
    public Student(String Name, String Email, String ID, String Year) {
        setName(Name);
        setEmail(Email);
        setID(ID);
        setYear(Year);

    }
    
    //Student Methods
    public void StudentInfo() {
        System.out.println("Student: " + " name = " + Name + ", ID = " + ID + ", Email = " + Email + ", Year = " + Year);
    }

    public void addcourse(){
        
    }

    public void Displaycourses() {
        StudentInfo();
        
    }

    //Student Getters and Setters
    public String getName() {
        return Name;
    }

    private void setName(String Name) {
        this.Name = Name;
    }

    public String getID() {
        return ID;
    }

    private void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return Email;
    }

    private void setEmail(String Email) {
        this.Email = Email;
    }

    public String getYear() {
        return Year;
    }

    private void setYear(String Year) {
        this.Year = Year;
    }
}