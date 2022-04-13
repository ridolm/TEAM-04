package Projects_01;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberBetweenTwoNumbers {


    /*
    Given two positive integer numbers

     integer 1 is min
     integer 2 is max

    create a random number between min and max

    output should be int

     */

    /*
    İki tane pozitif integer sayısı verildiğinde

    sayı 1 min degerinde

    sayı 2 max degerinde

    min ve max arasinda random sayi elde et(olustur)

    output veri tipi int olmali
     */

    public static void main(String[] args) {
        int min=15;
        int max=35;
        IkiSayiArasindaRandomSayiBul(min,max);
        System.out.println(IkiSayiArasindaRandomSayiBul(35,45));
    }
    private static int IkiSayiArasindaRandomSayiBul(int min, int max) {
        int randomSayi = ThreadLocalRandom.current().nextInt(min+1, max);
        return randomSayi;
    }

    }

