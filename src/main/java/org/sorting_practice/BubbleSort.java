package org.sorting_practice;

public class BubbleSort {
    public static void main(String []args){
        int arr[] = {1,4,6,8,9,4,10,11,5};
        for(int i=0;i<arr.length;i++){
           for(int j = 0; j<arr.length-i-1;j++){
               int temp;
               if(arr[j]> arr[j+1]){
                   temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
        }
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
