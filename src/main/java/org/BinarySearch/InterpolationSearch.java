package org.BinarySearch;

public class InterpolationSearch {
    public static int interpolationS(int[] arr , int target){
        int left = 0;
        int right = arr.length-1;
         while(left <= right && arr[left] <= target && arr[right] >= target){
             if(left == right) {
                 if (arr[left] == target)
                     return left;
                 return -1;

             }
                 int pos = left + ((target - arr[left]) * (right - left))
                         / (arr[right] - arr[left]);
                 if(arr[pos] == target){
                     return pos;
                 }
                 if(arr[pos] < target){
                     left = pos +1;
                 }else{
                     right = pos-1;
                 }

             }
             return -1;
         }

    public static void main(String []args){
        int[] arr = {20,30,40,50,60,70};
        int target = 40;

        int result = interpolationS(arr, target);
            if (result != -1) {

                System.out.println("Element found at index: " + result);
            }else{
                System.out.println("Element not found");
            }
            }
    }

