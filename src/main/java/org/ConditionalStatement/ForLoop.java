package org.ConditionalStatement;
 //print first 10 natural numbers
public class ForLoop {
    public static void main(String []args){

        for(int i=1 ; i<=10 ; i++){
            if(i%5==0){
                System.out.println("Hello!!");
                continue; //break;
            }
            System.out.print(i + " ,");


        }
       System.out.println("sanskriti ");
    }

}
