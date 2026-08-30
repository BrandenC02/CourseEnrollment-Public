

import java.util.ArrayList;
import java.util.List;


public class Course {
    //Attributes
    private String Name;
    private String Location;
    private int Capacity;
    private String ID;
    
    //Course Constructor
    public Course(String Name, String Location, String ID, int Capacity) {
        setCapacity(Capacity);
        setID(ID);
        setName(Name);
        setLocation(Location);
        
    }

    //Course Methods
    public void addStudent(){
        
    }
    
    public void DisplayStudents() {
        CourseInfo();
        
    }

    
    public void CourseInfo() {
        System.out.println("Course: " + "Name = " + Name + ", Location = " + Location + ", Capacity = " + Capacity + ", ID = " + ID);
    }


    //Course Getters and Setters
    public String getName() {
        return Name;
    }

    private void setName(String Name) {
        this.Name = Name;
    }

    public String getLocation() {
        return Location;
    }

    private void setLocation(String Location) {
        this.Location = Location;
    } 
    
    public int getCapacity() {
        return Capacity;
    }

    private void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public String getID() {
        return ID;
    }

    private void setID(String ID) {
        this.ID = ID;
    }
    
    private int updateCapacity(){
        this.Capacity = this.Capacity - 1;
        return Capacity;
    }
}