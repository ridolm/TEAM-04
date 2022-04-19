package Projects_01;

import java.util.Scanner;

public class totalLetterCountCheck {

    /*
        Given a String ,
            if the count of the letter in the String is odd print true else print false

     */

    /*
     Bir String verildiğinde

     Eger String harf sayisi tek ise true print et değilse false print et

     */

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String kelime=scanner.nextLine();



        if (kelime.length()%2==0){

            System.out.println(false);
        }else {
            System.out.println(true);
        }

    }
}
