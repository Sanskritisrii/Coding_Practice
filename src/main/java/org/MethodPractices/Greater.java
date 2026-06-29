package org.MethodPractices;

public class Greater {

    public void printNumber(int a,int b){
        if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }

    }

    public void printNumber(int a, int b, int c){
        if(a>b && a>c){
            System.out.println("a is greater");
        }else if(b>c){
            System.out.println("b is greater ");
        }else{
            System.out.println("c is greater");
        }
    }
}
