package sortArray;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};

        //The idea is big bubble goes top first

        boolean isSorted = false; // by default array is not sorted
        while (!isSorted){
        isSorted = true; // make array as sorted
            for(int i = 1; i < arr.length ; i++ ){
                if(arr[i]<arr[i-1]){
                    int temp = arr[i];  //
                    arr[i]=arr[i-1];    //  Change place bigger to left
                    arr[i-1]=temp;      //
                    isSorted=false; // if detect one change make array as not sorted
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
