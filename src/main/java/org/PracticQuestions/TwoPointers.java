package org.PracticQuestions;

//Two Sum II - Input Array Is Sorted
public class TwoPointers {
    public static int[] twoSum(int[] arr , int target){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[] {left+1 , right+1};
            }
            else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1 ,-1};
    }
    public static void main(String []args){
        int[] arr = {1,3,5,7,9};
        int target = 4;
        int[] result = twoSum(arr,target);
        System.out.println(result[0] + " " + result[1]);

    }
}
