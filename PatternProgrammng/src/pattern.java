public class pattern {
    public static void main(String arg[]){
        pattern p1 = new pattern();
//        p1.pattern1();
//        p1.pattern2();
        p1.pattern3();


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



}
