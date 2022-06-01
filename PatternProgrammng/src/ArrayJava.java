// type[] arrayName = new type[size]
import java.util.*;
public class ArrayJava {

    public static void main(String args[]){
//        ArrayFirstEx(3);
        ArrayJava a = new ArrayJava();

//        a.secExample();
//        a.thirdExample();
//        problem();
//        prob1();
//        prob2();
//        System.out.println(prob3());

//        2D array
//        prob2d1();
        prob2d2();
    }

    public static void ArrayFirstEx(int size){
        int myArray[] = new int[size];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
//        System.out.println(myArray[1]);
        for(int i = 0; i<3; i++){
            System.out.println(myArray[i]);
        }
    }

    public void secExample(){
        int myArray[] = {1,2,3,4,5};
        for(int i = 0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

    public void thirdExample(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int myArray[] = new int[n];

        for(int i= 0; i<n; i++){
            System.out.print("Enter value: ");
            myArray[i] = sc.nextInt();
        }
        System.out.print("Output: ");
        for(int j = 0; j<n; j++){
            System.out.println(myArray[j]);
        }
    }

//    Take an array as input from the user. Search for a given number x and print the index at which it occurs.
    public static void problem(){
        System.out.print("Enter Size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int myArray[] = new int[n];

        System.out.print("Enter Array value: ");
        for(int i = 0; i<n; i++){
            myArray[i] = sc.nextInt();
        }

        System.out.print("Show Values : ");
        for(int j = 0; j<myArray.length; j++){
            System.out.println(myArray[j]);
        }

        System.out.print("Enter Value for search: ");
        int search = sc.nextInt();
        for(int k = 0; k<myArray.length; k++){
            if(myArray[k] == search){
                System.out.println("Value found in:" +k+" position");
            }
        }
    }
    // Take an array of names as input from the user and print them on the screen.
    public static void prob1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter names: ");
        String name[] = new String[5];
        for(int i = 0; i<5; i++){
            name[i] = sc.next();
        }
        System.out.println("Output :");
        for(int i= 0 ; i<name.length; i++){
            System.out.println(name[i]);
        }
    }

//    Find the maximum & minimum number in an array of integers.
    public static void prob2(){
        int myArr[] = {2,3,4,5,6,1};
        int min = 10;
        int max = 0;
        for(int i = 0; i<myArr.length;i++){
            if(max <= myArr[i]){
                max = myArr[i];
            } else if (min >= myArr[i]) {
                min = myArr[i];
            }
        }
        System.out.println("Maximum no. : "+ max);
        System.out.println("Minimum no. : "+ min);
    }

    public static void prob21(){
        int myArr[] = {2,3,4,5,6,1};
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i<myArr.length;i++){
            if(max <= myArr[i]){
                max = myArr[i];
            } else if (min >= myArr[i]) {
                min = myArr[i];
            }
        }
        System.out.println("Maximum no. : "+ max);
        System.out.println("Minimum no. : "+ min);
    }

//    Take an array of numbers as input and check if it is an array sorted in ascending order.
//    Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//    {3, 4, 6, 2} is not sorted in ascending order.

    public static String prob3(){
        int myArr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            System.out.print("Enter "+(i+1)+" value :");
            myArr[i] = sc.nextInt();
        }
        boolean isAssending;
        for(int i=0; i<myArr.length; i++){
            if(myArr[i] < myArr[i+1]){
                isAssending = true;
            }else{
                isAssending = false;
            }

            if(isAssending){
                return "Array is sorted";
            }else {
                return "Array is not sorted";
            }
        }
        return null;
    }
//    2 D Array in java

    //int[][] arrayName = new int[row][col];   ....syntax
    public static void prob2d1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int row = sc.nextInt();
        System.out.print("Enter colomn : ");
        int col = sc.nextInt();

        int[][] myMatrix = new int[row][col];
        System.out.print("Enter ele :");

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                myMatrix[i][j]= sc.nextInt();
            }
        }

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(myMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

//    Searching for an element x in a matrix.
public static void prob2d2(){
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter row size: ");
    int a = sc.nextInt();
    System.out.print("Enter col size: ");
    int b = sc.nextInt();

    int myMatrix[][] = new int[a][b];

    for(int i = 0; i<a; i++){
        for(int j =0; j<b; j++){
            myMatrix[i][j] = sc.nextInt();
        }
    }

    System.out.print("Enter Serching Element : ");
    int search = sc.nextInt();

    for(int i= 0; i<a; i++){
        for(int j= 0; j<b; j++){
            if(myMatrix[i][j] == search){
                System.out.println("Index is : ("+i+","+b+")");
            }
        }
    }
//
//    public static void myString(){
//
//    }
}
}
