package org.PracticQuestions;
//average of the elements
public class Problem12 {
    public static void main(String []args){
        int[] arr2 = {1,3,4,5,6,7};
        int sum =0;
        for(int i=0;i<arr2.length;i++){
            sum = sum+arr2[i];

        }
        int avg = sum/arr2.length;
        System.out.println("Average of the elemnets: " + avg);
    }
}
