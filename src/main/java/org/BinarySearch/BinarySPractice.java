package org.BinarySearch;

public class BinarySPractice {

    public static void main(String []args){

        int[] arr = {1,2,3,4,6,7,8,9,10};
        int start = 0;
        int end = arr.length-1;
        int target = 9;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;

            }else{
                System.out.println("Traget found at index : " + mid);
                return;
            }
        }
        System.out.println(-1);
    }
}
