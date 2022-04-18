package Projects_02;

public class minNumber {

      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        print the min number from the 2d array
     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

         int 2D arrayini  olustur

        2D arrayinden min number print et

     */

        public static void main(String[] args) {


            int a[][] = {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};

            int x = Integer.MAX_VALUE;

            for(int [] w: a){
                for(int m : w){
                    if(x>m){
                        x=m;
                    }
                }
            }
            System.out.println(x);

        }
}
