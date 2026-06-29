package org.PracticQuestions;
//reverse a number

public class Problem8 {
    public void reverseNumber(int num , int reverse){

        while(num > 0){
            int a = num%10;
            reverse = reverse * 10 + a;
            num = num/10;
        }
        System.out.println(reverse);
    }
}
