package org.PracticQuestions;
//switch case statement assigning grade to the student
public class Problem7 {
    public void chechGrade(int marks){
        switch (marks/10){
            case 10 :
                System.out.println("Grade A+");
                break;
            case 9 :
                System.out.println("Grade A");
                break;
            case 8 :
                System.out.println("Grade B");
                break;
            case 7 :
                System.out.println("Grade C");
                break;
            case 6 :
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Fail");
        }
    }

}
