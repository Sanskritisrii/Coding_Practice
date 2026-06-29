package org.PracticQuestions;
//Fibonacci series
public class Problem10 {
    public static void main(String []args){

        int num1= 0;
        int num2= 1;

        System.out.print(num2 + " ");

        for(int i =0 ; i<=10 ; i++){
            int num = num1+num2;
            num1=num2;
            num2=num;
            System.out.print(num + " ");
        }
    }

}
