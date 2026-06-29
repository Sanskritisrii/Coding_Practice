package org.PracticQuestions;
import java.util.Scanner;
public class Problem2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name :");
        String name = sc.nextLine();

        System.out.println("Enter your fav hobby : ");
        String hobby =  sc.nextLine();

        System.out.println("Welcome " + name + " ! " + " Your fav hobby is " + hobby);
    }
}
