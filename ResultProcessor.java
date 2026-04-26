class InvalidMarkException extends Exception{
    InvalidMarkException(String msg){
        super(msg);
    }
}

class Student{
    double marks;
    void calculateGrade() {

        if (marks >= 80)
            System.out.println("Grade: A+");
        else if (marks >= 70)
            System.out.println("Grade: A");
        else if (marks >= 60)
            System.out.println("Grade: A-");
        else if (marks >= 50)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: F");
    }
    void setMarks(int marks) throws InvalidMarkException {

        if(marks<0||marks>100) throw new InvalidMarkException("Invaild Marks!");
        this.marks=marks;
        System.out.println("The obtained Marks:"+marks);
    }
}



public class ResultProcessor {
    public static void main(String[] args) {
        Student s=new Student();
        try{
            s.setMarks(70);
            s.calculateGrade();
            s.setMarks(120);
            s.calculateGrade();
        }
        catch (InvalidMarkException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
