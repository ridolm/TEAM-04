package Projects_02;

import java.util.Arrays;
import java.util.Scanner;

public class Common2Arrays {

    /*
         Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
         Both arrays will be length 1 or more.

        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true

     */

    /*

        a ve b den oluşan 2 int array verildiğinde, aynı ilk öğeye sahiplerse veya aynı son öğeye sahiplerse true değerini döndürün.

        Her iki arrayin lengthi(öğe sayısı) 1 veya daha fazla olacaktır.

       commonEnd([1, 2, 3], [7, 3]) → true
       commonEnd([1, 2, 3], [7, 3, 2]) → false
       commonEnd([1, 2, 3], [1, 3]) → true

    */
    public static void main(String[] args) {

       int [] a ={1,2,3};
       int [] b ={1,3,5,8};

        boolean esitMi=false;

       if(a[0]==b[0] || a[a.length-1]==b[b.length-1]){

                 esitMi=true;
             }
        System.out.println(esitMi);


                }
            }















