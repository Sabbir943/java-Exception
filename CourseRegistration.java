/*
* Problem 3: Online Course Registration System
Scenario: A university offers online courses. A student must complete prerequisite courses
before enrolling in an advanced course. If the prerequisite is not completed, the system should
throw an exception.
Required Classes
• Course
• PrerequisiteNotCompletedException
• CourseRegistration
Required Methods
• registerCourse(String courseName)
• checkPrerequisite()
Implementation Idea
The Course class stores course name and prerequisite information. When the registerCourse()
method is called, the system verifies whether the student has completed the prerequisite course.
If not, a PrerequisiteNotCompletedException is thrown
* */
class PrerequisiteNotCompletedException extends Exception{
    PrerequisiteNotCompletedException(String msg){
        super(msg);
    }
}

class Course{
    String courseName;
    boolean prerequisiteCompleted;
    Course(String courseName,boolean prerequisiteCompleted){
        this.courseName=courseName;
        this.prerequisiteCompleted=prerequisiteCompleted;
    }
    void checkPrerequisite(){
        if(prerequisiteCompleted){
            System.out.println("pre requested course is  Completed");
        }
        else{
            System.out.println("pre requested course is not Completed ");
        }
    }
    void registerCourse(String courseName) throws PrerequisiteNotCompletedException{
        if(!prerequisiteCompleted) throw new PrerequisiteNotCompletedException("You must complete prerequisite first!");
        System.out.println("Successfully registered in "+courseName );
    }


}


public class CourseRegistration {
    public static void main(String[] args) {
       Course c=new Course("Advance java",false);
       try{
          c.checkPrerequisite();
          c.registerCourse("Advance java");
       }
       catch (PrerequisiteNotCompletedException e){
           System.out.println("Error: "+ e.getMessage());
       }
    }
}
