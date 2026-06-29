package org.PracticQuestions;
 //leap year
public class Problem9 {

    public void leapYear(int year){

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " = Leap Year !!");
        }else{
            System.out.println(year + " Not a Leap year ");
        }
    }
}
