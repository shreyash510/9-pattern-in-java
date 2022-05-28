
public class w3resouceProblem {
    public static void main(String args[]){
//        area(7.5);
//        average(2,4,8);
//        rectangle(8.5, 5.5);
//        flag();
//        swap(2,5);
        binary(10, 11);
    }
    //    Write a Java program to print the area and perimeter of a circle.
    public static void area(double r){
        double area =  Math.PI * r * r;
        double parameter = 2 * Math.PI * r;
        System.out.println("Area is:"+area+"\n"+"Parameter is:"+parameter);
    }

//    12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
    public static void average(int a,int b,int c){
        int ans = (a+ b+ c)/3;
        System.out.println("Average : "+ans+"%");
    }
//    13. Write a Java program to print the area and perimeter of a rectangle.
    public static void rectangle(double l, double w){
        double area =  l * w;
        double ans = l + w;
        double parameter = 2 * ans;
        System.out.println("Area is:"+area+"\n"+"Parameter is:"+parameter);
    }
//    14. Write a Java program to print an American flag on the screen.
    public static void flag(){
        for(int i= 0; i<10; i++){
            for(int j= 0; j<10; j++){
                if(i== 2 || j == 2) {
                    System.out.print("* * ");
                }else{
                    System.out.print("= = ");
                }
            }
            System.out.println();
        }
    }

//    15. Write a Java program to swap two variables.
    public static void swap(int a, int b){
        int temp ;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a :"+a+"\n"+"b :"+b);
    }
//    17. Write a Java program to add two binary numbers
    public static  void binary(int a, int b ){
        System.out.println(a%10);
        a = a / 10;
        System.out.println(a%10);
//        for(int i = 0; )
    }
}

