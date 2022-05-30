

/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    //creates four variables
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;

    //constructor that initialize 3 variables and one with empty string
    public Course(String courseID, String courseName, int duration){
        this.courseID = courseID;
        this.courseName = courseName;
        this.duration = duration;
        this.courseLeader = "";
    }

    //getter method to get access in variables
    public String getCourseID(){
        return this.courseID;
    }

    public String getCourseName(){
        return this.courseName; 
    }

    public String getCourseLeader(){
        return this.courseLeader;
    }

    public int getDuration(){
        return this.duration;
    }
    //setting or updating the value for courseleader using setter method
    public void setCourseLeader(String courseLeader){
        this.courseLeader = courseLeader;
    }
    //display 3 given variables and if courseleader is an empty string otherwise  
    //display courseleader with 3 given varibales
    public void display(){
        String result = "Course ID is " + getCourseID() + "\nCourse Name is " + getCourseName()
            + "\nDuration is " + getDuration();
        if(getCourseLeader().equals(""))
            System.out.print(result);
        else
            System.out.print(result + "\nCourse Leader is " + getCourseLeader());
    }   
}
