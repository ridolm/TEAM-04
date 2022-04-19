package Projects_01;

import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {

        /*
            Given two string by using scanner class and add each other
            if first word last letter is same with second word first letter then remove one of them.

            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */


        /*
        Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle .

        Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın

       Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"

         */


        Scanner scan=new Scanner(System.in);
        System.out.print("İlk kelimeyi giriniz : ");
        String ilkKelime=scan.next();
        System.out.print("İkinci kelimeyi giriniz : ");
        String ikinciKelime=scan.next();
        String yeniKelime="";//iki kelimeyi birlestirmek için olusturuldu

        if (ilkKelime.endsWith(ikinciKelime.substring(0,1))){//ilk kelimenın son harfı ıle ikinci kelimenin ilk harfi aynı mi?

            // diye control ediyoruz

                                                             // diye control ediyoruz

            yeniKelime=ilkKelime+ikinciKelime.substring(1);
        }else{
            yeniKelime=ilkKelime+ikinciKelime;
        }
        System.out.println(yeniKelime);





        System.out.println("yaparım");



    }
}
