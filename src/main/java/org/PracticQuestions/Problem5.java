package org.PracticQuestions;
//conditional statement driving licence

public class Problem5 {
    public void CheckEligibility(int age, boolean licence ){
        if(age >= 18 && licence){
            System.out.println("Eligible for driving");
        }else{
            System.out.println("Not eligible for driving!!");
        }
    }

}
