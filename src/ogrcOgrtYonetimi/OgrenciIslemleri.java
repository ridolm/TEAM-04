package ogrcOgrtYonetimi;

import java.util.HashMap;
import java.util.Scanner;

public class OgrenciIslemleri extends Method implements Islem, GirisCikisInterface{
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner scan = new Scanner(System.in);
    static HashMap<String, Ogrenci> ogrenci=new HashMap<>();
    @Override
    public void girisPaneli() {
        System.out.println(R+"============= OGRENCI ISLEMLERI =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n" +
                "\t\t 0-ÇIKIŞ");
        System.out.println("Yapmak istediniz islemi secin");
        int secim=scan.nextInt();
        switch (secim){
            case 1:
                ekleme(); girisPaneli(); break;
            case 2:
                arama(); girisPaneli(); break;
            case 3:
                listeleme(); girisPaneli(); break;
            case 4:
                silme(); girisPaneli(); break;
            case 5:
                girisPaneli();break;
            case 0:
                cikisYap(); break;
            default:
                System.out.println("Hatali secim yaptınız");
                girisPaneli();break;

    }

}
    @Override
    public void cikisYap() {
        Method obj=new Method();
        obj.cikisYap();
    }


    @Override
    public void ekleme() {
        System.out.println("ogrenci adiSoyadi");
        String adiSoyadi=scan.nextLine();
        scan.next();
        System.out.println("ogrenci kimlik no");
        String kimlikNo=scan.next();
        scan.nextLine();
        System.out.println("ogrenci yas");
        int yas=scan.nextInt();
        System.out.println("ogrenci numara");
        int numara=scan.nextInt();
        System.out.println("ogrenci sınıf");
        scan.next();
        String sinif=scan.nextLine();
        Ogrenci okul=new Ogrenci(adiSoyadi,kimlikNo,yas,numara,sinif);
        ogrenci.put(kimlikNo,okul);
    }

    @Override
    public void arama() {

    }
    @Override
    public void listeleme() {


    }

    @Override
    public void silme() {
    }}

