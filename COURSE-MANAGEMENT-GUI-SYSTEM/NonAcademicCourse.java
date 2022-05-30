 


/**
 * Write a description of class NonAcademicCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NonAcademicCourse extends Course
{
    //creating 8 variables
    private String instructorName;
    private String startingDate;
    private String completionDate;
    private String examDate;
    private String preRequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    //constructor method which inherits 3 variable from main class and initailize given variables
    public NonAcademicCourse(String courseID, String courseName, int duration, String preRequisite){
    super(courseID, courseName, duration);
    this.preRequisite = preRequisite;
    this.startingDate = "";
    this.completionDate = "";
    this.examDate = "";
    this.isRegistered = false;
    this.isRemoved = false;
    }
    //getter method to get accsess all variables
    public String getInstructorName() {
        return this.instructorName;
    }

    public String getStartingDate() {
        return this.startingDate;
    }

    public String getCompletionDate() {
        return this.completionDate;
    }

    public String getExamDate() {
        return this.examDate;
    }

    public String getPreRequisite() {
        return this.preRequisite;
    }

    public boolean getIsRegistered() {
        return this.isRegistered;
    }

    public boolean getIsRemoved() {
        return this.isRemoved;
    }
    //setter method to register Instruction name if not
    public void setInstructorName(String instructorName){
    if (!getIsRegistered())
        this.instructorName = instructorName;
    else{
        System.out.printf("It is not possible to change Instructor name");
        }
    }
    //If not registered, insert variables else print registered
    public void register(String courseLeader,String instructorName,String startingDate,String completionDate,String examDate){
        if (!getIsRegistered()){
          this.setInstructorName(instructorName);
          this.isRegistered = true;
          this.startingDate = startingDate;
          super.setCourseLeader(courseLeader);
          this.completionDate = completionDate;
          this.examDate = examDate;
        }
        else{
        System.out.printf("The course is already registered");  
        } 
    }
    //removed method in non-academic
    public void remove(){
    if (getIsRemoved()){
        System.out.printf("The system is already Removed");
        }
    else{ 
        super.setCourseLeader("");
        this.instructorName = "";
        this.startingDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;
        this.isRemoved = true;
        }
    }
    //display non-academic with Course class
    public void display(){
        String result ="\nInstructor Name = "+ getInstructorName() + "\nStarting Date = " + getStartingDate() + "\nCompletion Date" + getCompletionDate() + "\nExamination Date = " + getExamDate();
            if (getIsRegistered()){
                super.display();
                System.out.print(result);
            }
            else{
                super.display();
            }
    }
}

