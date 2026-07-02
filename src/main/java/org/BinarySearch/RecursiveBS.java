package org.BinarySearch;

public class RecursiveBS {

        public static int binarySearch(int[] arr, int target) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        public static int binarySearch(int[] arr, int target, int left, int right) {
            if (left <= right) {
                int mid = left + (right - left) / 2;

                // If the target is found at mid, return mid
                if (arr[mid] == target) {
                    return mid;
                }

                // If the target is greater than the element at mid, search the right half
                if (arr[mid] < target) {
                    return binarySearch(arr, target, mid + 1, right);
                }

                // If the target is smaller than the element at mid, search the left half
                return binarySearch(arr, target, left, mid - 1);
            }

            // If the element is not present in the array, return -1
            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {2, 3, 4, 10, 40};
            int target = 10;
            int result = binarySearch(arr, target);
            if (result != -1) {
                System.out.println("Element found at index " + result);
            } else {
                System.out.println("Element not found in the array");
            }
        }
    }
