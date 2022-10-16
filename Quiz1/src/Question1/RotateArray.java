package Question1;

import java.util.Arrays;

/*Given an array, rotate the array to the right by k steps, where k is non-negative.
* */
public class RotateArray {
    public void rotateArray(int[] arr, int k){
        int[] temp = new int[arr.length];
        int currentIndex = 0;
        int arrLength = arr.length;

        // add n-d elements in array
        for(int i = k; i<arrLength; i++){
            temp[currentIndex] = arr[i];
            currentIndex++;
        }


        for(int i=0; i<k; i++){
            temp[currentIndex] = arr[i];
            currentIndex++;
        }

        for(int i=0; i<arrLength; i++){
            arr[i] = temp[i];
        }

        System.out.println("Rotated Array " + Arrays.toString(arr));

    }

}
