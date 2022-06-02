public class recursionMethod {
    public static void main(String arg[]){
        number1to5(1);
    }
//    Print 1 to 5 using recursion
    public static void number1to5(int n){
        if(n == 5){
            return;
        }
        System.out.println(n);
        number1to5(n+1);
    }
}
