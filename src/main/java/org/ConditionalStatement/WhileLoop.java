package org.ConditionalStatement;

public class WhileLoop {

    public static void main(String []args){

//        int i =1;
//        while (i <= 10) {
//            System.out.println(i + ",");
//           // if (i ==5)
//               //continue;
//            i++;

            // print the factorial of 5
        int i=5;
        int result =1;
        while(i>=1){
            result= result*i;
            i--;
        }
        System.out.println(result);
    }
}
