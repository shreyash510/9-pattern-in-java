public class advancePattern {
    public static void main (String args[]){
        advancePattern p1 = new advancePattern();
//        p1.pattern1();
//        p1.pattern2();
        p1.pattern3();

    }
    public void pattern1(){
        /*
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
       */
//        top part
        int n = 5;
        for(int i = 0; i<n; i++){
            for(int j= 0; j<i+1; j++){
                System.out.print("* ");
            }
            for (int j=0; j<(n-i-1)*2; j++){
                System.out.print("  ");
            }
            for (int k=0; k<i+1; k++){
                System.out.print("* ");
            }
            System.out.println("  ");
        }
//        bottom part
        for(int i = 0; i<n; i++){
            for(int j= 0; j<n-i; j++){
                System.out.print("* ");
            }
            for (int j=0; j<i*2; j++){
                System.out.print("  ");
            }
            for (int k=0; k<n-i; k++){
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }

    public void pattern2(){
       /*
        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *
    */
        int n = 5;
        for(int i = 0; i<n;i++){
            for(int j= 1; j<n-i; j++){
                System.out.print("  ");
            }
            for(int k = 0; k<n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern3(){
        /*
    ----1
    ---2 2
    --3 3 3
    -4 4 4 4
    5 5 5 5 5

         */
        int n = 5;
        for(int i = 0; i<n; i++){
            for(int j =0 ; j< n-i+1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k< i+1; k++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}
