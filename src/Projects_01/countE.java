package Projects_01;

import java.util.Arrays;
import java.util.Scanner;

public class countE {

/*    Determine and print the number of times
      the character ‘b’ appears in the input entered by the user.

     input: Test output
            b: 0
        output should be 0


     input: bucket
            b:1
        output should be 1
        */


    //hint: .charAt, length(), for, index, counter,



    /*  Kullanıcı tarafından girilen inputda kac tane 'b' karakteri olduğunu belirle ve print et.

     input: Test output
            b: 0
        output 0 olmalı


     input: bucket
            b:1
        output 1 olmalı
        */


    //hint: .charAt, length(), for, index, counter,

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Lutfen bir string ifade giriniz : ");
        String str=input.nextLine();
        int counter=0;

        String arr[]=str.split("");

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].contains("b")||arr[i].contains("B")){

                counter++;
            }

        }
        System.out.println("String ifadede "+counter+" tane 'b' harfi vardir");

    }
}
