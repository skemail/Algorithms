package sortArray;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {

        int [] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};

        for(int i = 0;i<array.length;i++){
            int temp = array[i];
            int index = minIndex(array,i);
            array[i] = array[index];
            array[index] = temp;
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }

    public static int minIndex(int[] arr, int startIndex){
        int minIndex = startIndex;
        int minElement = arr[startIndex];

        for (int i = startIndex+1; i<arr.length;i++){
            if(minElement>arr[i]){
                minElement = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
/*
https://www.youtube.com/watch?v=gjzLnfYc48w&list=PL5BhKu-LkR_0mDGftRWeaakqGuYE1ToGG&index=4
*/
