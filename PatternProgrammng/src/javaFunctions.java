public class javaFunctions {
    public static int myName(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String arg[]){
        int a = 2, b = 3;

        int myAns = myName(a, b);
        System.out.println(myAns);
    }
}
