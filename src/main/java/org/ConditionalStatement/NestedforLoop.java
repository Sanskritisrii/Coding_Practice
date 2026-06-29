package org.ConditionalStatement;

public class NestedforLoop {

    public static void main(String []args){

        for(int i =1 ; i <= 5 ; i++){
            System.out.print(i + ":");
            for(int j =1 ; j <=3 ; j++){
                System.out.print(j + ",");

                for(int k =1; k<=2; k++){
                    System.out.print(k + ";");
                    if(j==4)
                        break;
                }
            }
            System.out.println();
        }
    }
}
