import java.util.Scanner;
public class DataStructure {
    public static void main(String args[]){
//        bubble();
        selection();
    }

//    Bubble Searching
    public static void bubble(){
        int myArray[] = {5,4,3,2,1};
        System.out.print("Original Value: ");
        for(int i = 0; i<myArray.length; i++){
            System.out.print(myArray[i]+" ");
        }

        for(int x =0; x<myArray.length-1; x++){
            for(int y = 0; y<myArray.length-1-x; y++){
                if(myArray[y] > myArray[y+1]){
                    int temp = myArray[y];
                    myArray[y] = myArray[y+1];
                    myArray[y+1] = temp;
                }
            }
        }
        System.out.println();
        show(myArray);
    }

    //selection sort
    public static void selection(){
        int myString[] = {8,4,3,2,1};
        for(int i =0;i<myString.length; i++){
            int smallest = i;
            for(int j = i+1; j<myString.length; j++){
                if(myString[smallest]>myString[j]){
                    smallest = j;
                }
            }
            int temp = myString[smallest];
            myString[smallest] = myString[i];
            myString[i] = temp;
        }
        show(myString);
    }
    public static void show(int arr[]){
        System.out.print("Sorted Value : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
