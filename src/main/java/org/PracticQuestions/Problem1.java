package org.PracticQuestions;
import java.util.Scanner;
public class Problem1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        int result = a * a;
        System.out.println("Value : " + result);
    }
}
