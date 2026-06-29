package org.Array;

import java.util.Scanner;

public class Duplicate {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int[] a= {1,2,3,4,5,3,6,6,7,8};

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int duplicat = 0;
        for(int i =0;i<a.length;i++){
            if(a[i]==num){
                duplicat++;
            }
        }
        if(duplicat>1){
            System.out.println(true);
            System.out.println("Number of Duplicates : " + duplicat);
        }
    }
}
