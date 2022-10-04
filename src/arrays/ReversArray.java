package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * To reverse a given array
 *
 * @author Karl Sirkas
 */

public class ReversArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many array elements?");
        int arrLength = scanner.nextInt();

        System.out.println("Enter array elements one after an other");

        int[] arr =new int [arrLength];
        int[] reversArr = new int [arrLength];
        for (int i = 0; i < arrLength; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("In put array is" + Arrays.toString(arr));

        int j = 0;
        for(int i = arrLength - 1; i >= 0; i--){
            reversArr[j] = arr[i];
            j++;
        }

        System.out.print("Reverse array is" + Arrays.toString(reversArr));
    }

}
