 


/**
 * Write a description of class AcademicCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AcademicCourse extends Course{
  //creating 7 variables
  private String lecturerName;
  private String level;
  private String credit;
  private String startingDate;
  private String completionDate;
  private int numberOfAssessments;
  private boolean isRegistered;
  //constructor and inherit 3 variable from main class
  public AcademicCourse(String courseID,String courseName, int duration, String level, String credit, int numberOfAssessments){
  super(courseID, courseName, duration);
  this.level = level;
  this.credit = credit;
  this.numberOfAssessments = numberOfAssessments;
  this.startingDate = "";
  this.completionDate = "";
  this.lecturerName = "";
  this.isRegistered = false;
  }
  // Getter method to get accsess in all variable 
   public String getLecturerName(){
    return this.lecturerName;
   }
   public String getLevel(){
    return this.level;
   } 
   public String getCredit(){
    return this.credit;
   }
   public String getStartingDate(){
    return this.startingDate;
   }
   public String getCompletionDate(){
    return this.completionDate;
   }
   public int getNumberOfAssessments(){
    return this.numberOfAssessments;
   }
   public boolean getIsRegistered(){
    return this.isRegistered;
   }
  //setter method that assign new value in lectureName and numberOfAssessments
   public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }
   public void setNumberOfAssessments(int numberOfAssessments){
    this.numberOfAssessments= numberOfAssessments;
    }
    //If register show 3 variable else initialize variables
   public void register(String courseLeader, String lecturerName, String startingDate, String completionDate){
    if (getIsRegistered()){
     System.out.printf("The course is already registered and the instructor name is"+ getLecturerName() + ". Started in"+ getStartingDate()+ "and completed in"+ getCompletionDate());
    } else{
     super.setCourseLeader(courseLeader);
     this.lecturerName = lecturerName;
     this.startingDate = startingDate;
     this.completionDate = completionDate;
     this.isRegistered = true;
     }
    
    } 
    //display Academic course if registered with Course else only Course 
   public void display(){
    String result = "\nLecturer Name = " + getLecturerName() + "\nLevel = " + getLevel() + "\nCredit = " + getCredit() + "\nStarting Date = " + getStartingDate() + "\nCompletion Date = " + getCompletionDate() + "\nTotal Assessments = " +  getNumberOfAssessments();
        if (getIsRegistered()){
            super.display();
            System.out.print(result);
        }else
            super.display();
    } 
}




