package _2.arrays;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] oddArray = {1,2,3,4,5};
        int[] evenArray = {1,2,3,4,5,6};
        reverse(oddArray);
        reverse(evenArray);
        System.out.println(Arrays.toString(oddArray));
        System.out.println(Arrays.toString(evenArray));
    }

    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2){
         int temp = arr[index1];
         arr[index1]=arr[index2];
         arr[index2]=temp;
    }
}
