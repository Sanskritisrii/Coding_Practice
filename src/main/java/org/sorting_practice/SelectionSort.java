package org.sorting_practice;

public class SelectionSort {

    public static void main(String []args) {
        int[] arr = {3, 5, 1, 4, 67, 1, 2, 23, 34, 55, 11, 33, 67};

        for (int i=0;i<arr.length;i++){
            int smallest = arr[i];
            int smallestPosition = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<smallest){
                    smallest = arr[j];
                    smallestPosition = j;
                }
            }
            int temp = arr[i];
            arr[i] = smallest;
            arr[smallestPosition] = temp;
        }


        for (int i : arr){
            System.out.print(i +" ");
        }



    }
}
