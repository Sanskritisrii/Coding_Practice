package org.ConditionalStatement;
import java.util.Scanner;
public class Switchcase {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        switch(a){
            case 1: {
                System.out.println("number is 1");
                break;
            }
            case 2:{
                System.out.println("number is 2");
                break;
            }
            default:{
                System.out.println("bye bye");
            }
        }
    }
}
