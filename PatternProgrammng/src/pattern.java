public class pattern {
    public static void main(String arg[]){
        pattern p1 = new pattern();
//        p1.pattern1();
//        p1.pattern2();
//        p1.pattern3();
//        p1.pattern4();
//        p1.pattern5();
//        p1.pattern6();
//        p1.pattern7();
//        p1.pattern8();
        p1.pattern9();
    }
    public void pattern1(){
        /* 1st pattern */
//            * * * * *
//            * * * * *
//            * * * * *
//            * * * * *
//            * * * * *
        int n = 5;
        for(int i= 0; i<n; i++){
            for(int j =0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern2(){
        /*2nd pattern*/
//* * * * *
//*       *
//*       *
//*       *
//* * * * *
        int n = 5;
        for(int i = 0; i<n; i++){
            for(int j = 0 ; j < n; j++){
                if(j==0 || j==n-1 ||i==0 || i == n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void pattern3(){
//        3rd project
//*
//* *
//* * *
//* * * *
//* * * * *
        int n=5;
        for(int i = 0; i<n; i++){
            for(int j= 0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern4(){
        /*4th pattern
* * * * *
* * * *
* * *
* *
*
*/
        int n = 5;
        for(int i = 0; i<n; i++){
            for(int j= 0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern5(){
/*
          *
        * *
      * * *
    * * * *
  * * * * *

 */
        int n= 5;
        for(int i= 0; i<n; i++){
            for(int j= 0; j<n-i; j++){
                System.out.print("  ");
            }
            for(int k=0; k<i+1; k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public void pattern6(){
/*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

 */
        int n= 5;
        for(int i = 0; i<n; i++){
            for(int j= 0; j<i+1; j++){
                System.out.print(j+1+" ");
            }
            System.out.println(" ");
        }

    }
    public void pattern7(){
/*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1

 */
        int n = 5;
       for (int i = 0; i<n; i++){
           for(int j=0; j<n-i; j++){
               System.out.print(j+1+" ");
           }
           System.out.println(" ");
       }
    }
    public void pattern8(){
/*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15

 */
        int n= 5;
        int temp = 0;
        for(int i = 0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(temp+1+" ");
                temp++;
            }
            System.out.println(" ");
        }
    }
    public void pattern9(){
/*
        0
        1 0
        0 1 0
        1 0 1 0
        0 1 0 1 0

 */
        int n = 5;
        for(int i = 0; i<n ; i++){
            for(int j= 0; j<i+1; j++){
                int sum = i+j;
                if(sum %2 ==0 ){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println(" ");
        }
    }


}
