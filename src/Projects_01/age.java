package Projects_01;

import java.util.Scanner;


public class age {

     /*
        Given a int ,
            if the age less then and equal 10
                print  too young to create a facebook account

             if the age less then and equal 16
                print  too young to get a driver's license

             if the age less then and equal 18
                print  too young to get a tattoo

            if the age less then and equal 21
                print  too young to drink alcohol

            if the age bigger or equal to 21
                print  do what ever you want to do

        Note: use if else statement.
     */

/*
           Eğer age 10 dan küçük veya eşit ise
           facebook hesabi acmak icin cok gencsin print yapın.

           Eğer age 16 dan küçük veya eşit ise
           ehliyet almak icin cok gencsin print yapın.

           Eğer age 18 den küçük veya eşit ise
           dovme yaptirmak icin cok gencsin print yapın.

           Eğer age 21 den küçük veya eşit ise
           alkol icmek icin cok gencsin print yapın.

           Eğer age 21 den büyük ise
           istedigini yapabilirsin print yapın.
 */

    public static void main(String[] args) {

<<<<<<< HEAD
<<<<<<< HEAD
        int age=28;
        if (age<=10){
            System.out.println("facebook hesabi acmak icin cok gencsin");
        }else if (age<=16){
            System.out.println("ehliyet almak icin cok gencsin");
        }else if (age<=18){
            System.out.println("dovme yaptirmak icin cok gencsin");
        }else  if(age<=21){
            System.out.println("alkol icmek icin cok gencsin");
        }else if(age>21){
            System.out.println("istedigini yapabilirsin");
        }
=======
        System.out.println("hello world");
        System.out.println("asfdjaşsfjşas");
>>>>>>> 91502731d7f589b4469f485b3fa5b709d9283183
=======
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz : ");
        int yas = scan.nextInt();


        if (yas<0) {
            System.out.println("yanlis giris");
        }else if (yas<=10){
            System.out.print("facebook hesabi acmak icin cok gencsin");
        }else if (yas<=16) {
            System.out.print("ehliyet almak icin cok gencsin");
        } else if (yas<=18){
            System.out.print("dovme yaptirmak icin cok gencsin");
        }else if (yas<=21){
            System.out.print("alkol icmek icin cok gencsin");
        }else {
            System.out.print("istedigini yapabilirsin");


        }

>>>>>>> 20e6d29ca4e29cd0dc8a63191f38a23803e4a7d4
    }
}