package org.Array;

import java.util.Scanner;

public class Findthenumber {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,3,4,5,6,3,6,78,5};
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean isTrue = false;
        for(int i = 0; i<a.length;i++){
            if(a[i]==num){
                isTrue = true;
                break;
            }
        }
        System.out.println(isTrue);

    }
}
