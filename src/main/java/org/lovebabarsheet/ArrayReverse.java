package org.lovebabarsheet;

public class ArrayReverse {
    static void reverseArray(int[] arr){
        //1st way
//        int n =arr.length;
//        int[] temp = new int[n];
//
//        for(int i= 0; i<n;i++){
//            temp[i] = arr[n-i-1];
//        }
//        for(int i=0;i<n;i++){
//            arr[i]=temp[i];
//        }

        //swapping

        int left = 0;
        int right = arr.length-1;

        while(left<right){

            int temp= arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }

    }
    public static void main(String[] args){
        int[] arr = {4,6,2,1,3};
        reverseArray(arr);
        for(int i =0 ;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }


    }
}
