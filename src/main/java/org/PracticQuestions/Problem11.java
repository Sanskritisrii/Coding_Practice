package org.PracticQuestions;
//sum of an array
public class Problem11 {
    public static void main(String []args){
        int[] arr1 = {1,2,3,4,5};
        int sum =0;

        for(int i =0;i< arr1.length;i++){
            sum = sum+arr1[i];
        }
        System.out.println("Sum of array: " + sum);
    }
}
