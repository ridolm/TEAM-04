package Projects_01;

import java.util.Scanner;

public class getTotal {

    /*
      Given three positive Strings
      remove all the non numeric numbers.
      change the Strings to int
      and print the total

      Example:
      String num1 = "$15";
      String num2 = "$20";
      String num3 = "$30";
      output should be == 65;

      NOTE : if the output less then 0 change output to -1

  3 tane pozitif String verildiğinde
  sayısal olmayan tüm karakterleri kaldırın.
  Stringleri int e çevirin
  ve total print edin

      Ornek:
     String num1 = "$15";
     String num2 = "$20";
     String num3 = "$30";
     output ----> 65; olmali

     NOT : Eğer output 0 dan küçük ise outputu -1 e cevir

 */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("1. degeri giriniz");
        String num1 = scan.next();

        System.out.println("2. degeri giriniz");
        String num2 = scan.next();

        System.out.println("3. degeri giriniz");
        String num3 = scan.next();

        int sayi1 = Integer.parseInt(num1.replaceAll("[$A-Za-z]", ""));
        int sayi2 = Integer.parseInt(num2.replaceAll("[$A-Za-z]", ""));
        int sayi3 = Integer.parseInt(num3.replaceAll("[$A-Za-z]", ""));


        int toplam = (sayi1 + sayi2 + sayi3);

        if (toplam > 0) {
            System.out.println(toplam);

            int output = (sayi1 + sayi2 + sayi3);

            if (output > 0) {
                System.out.println(output);

            } else {
                System.out.println(-1);
            }

        }
    }
}

