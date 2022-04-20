package Projects_02;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArr {

      /*
        Given String array

        reverse the String array

        print the reversed array

        NOTE: While printing the array dont use for loop
        Use Arrays.toString(your_array_name);


     */


    /*

          Verilen String array

tring arrayi ters çevir

ters arrayi yazdır

       NOT:
       Arrays.toString(your_array_name);  <--- kullanın

     */


    public static void main(String[] args) {
        String[] arr = {"Java", "Intellij", "Slack", "Github"};
        System.out.println(Arrays.toString(arr));

        String arr2[] = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr2));

    }

}









