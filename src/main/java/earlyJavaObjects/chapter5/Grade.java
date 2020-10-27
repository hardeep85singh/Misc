package earlyJavaObjects.chapter5;

public class Grade {
    private String grade;
    private double gradeNum;

    public Grade(){}

    public Grade(String grade){
        this.grade = grade;
    }
    public Grade(double gardeNum){
        this.gradeNum = gradeNum;
    }

    public double getNumericGrade(String grade){
        if (grade == "A+"){
            return 4.0;
        } else if(grade == "A"){
            return 4.0;
        } else if (grade == "A-"){
            return 3.7;
        } else if (grade == "B+"){
            return 3.3;
        } else if (grade =="B"){
            return 3.0;
        } else if (grade =="B-"){
            return 2.7;
        } else if (grade =="C+"){
            return 2.3;
        } else if (grade == "C"){
            return 2.0;
        } else if (grade == "C-"){
            return 1.7;
        } else {
            return 1.0;
        }
    }

    public String getLetterGrade(double grade){
        if (grade == 4.0){
            return "A+";
        } else if(grade < 4.0 && grade >3.7 ){
            return "A";
        } else if (grade <= 3.7 && grade >3.3){
            return "A-";
        } else if (grade <= 3.3 && grade > 3.0){
            return "B+";
        } else if (grade <=3.0 && grade > 2.7){
            return "B";
        } else if (grade <=2.7 && grade > 2.3){
            return "B-";
        } else if (grade <= 2.3 && grade > 2.0){
            return "C+";
        } else if (grade <= 2.0 && grade > 1.7){
            return "C";
        } else if (grade <= 1.7 && grade > 1.3){
            return "C-";
        } else if (grade <=1.3 && grade > 1){
            return "D+";
        } else if (grade <= 1 && grade > 0.7){
            return "D";
        } else if (grade <=0.7 && grade > 0.3){
            return "D-";
        } else {
            return "F";
        }
    }

}
