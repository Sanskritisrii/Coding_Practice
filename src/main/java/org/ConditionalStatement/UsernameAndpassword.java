package org.ConditionalStatement;
import java.util.Scanner;
public class UsernameAndpassword {
    static String username = "sanskriti.srii";
    static String password = "12345";

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();

        if(name.equals(username)){
            System.out.println("enter your password: ");
            String inputpassword = sc.next();
            if(inputpassword.equals(password)){
                System.out.println("Login successful!!");
            }else{
                System.out.println("Password is incorrect");
            }

        }else{
            System.out.println("username is incorrect");
        }
    }
}
