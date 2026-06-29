package org.Array;

import java.util.Scanner;

public class TypesOfArray {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        //one dimension
        //int[] a = {1,2,3,4,5};


        //Two dimension
//        int[][] arr = {{1,2,3},{4,5,6}};
//        for(int i = 0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


//        for(int i = 0;i<arr[0].length;i++){
//            System.out.println(arr[0][i]);
//        }



        //user input
        int[][] a = new int[2][3]; //{{1,2,3},{4,5,6}}
        for(int r = 0;r<a.length;r++){
            for(int c = 0;c<a[r].length;c++){
                a[r][c] = sc.nextInt();
            }
        }
        for(int r = 0;r<a.length;r++) {
            for (int c = 0; c < a[r].length; c++) {
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }


    }
}
