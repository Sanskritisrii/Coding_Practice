package org.Array;

import java.util.Scanner;

public class Initialization {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
//        int[] a = {1,2,3,4,5}; //static
//        System.out.println(a[2]);


//        int[] b = new int[3]; //dynamic
//        b[0] = 2;
//        b[1] = 3;
//        b[2] = 4;
//        System.out.println(b[2]);
//        for(int i= 0;i<3;i++){
//            b[i]=sc.nextInt();
//        }
//        System.out.println(b[1]);

        //length
        int[] c = {1,2,3,4,5,66,7};
        //System.out.println(c.length);

        for(int k =0; k<c.length;k++){
            System.out.println(c[k]);
        }



    }
}
