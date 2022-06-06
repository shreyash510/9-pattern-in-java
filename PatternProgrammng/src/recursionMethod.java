public class recursionMethod {
    public static void main(String arg[]){
//        number1to5(1);

//        number5to1(5);

//        sumNo(0, 5, 0);

//        System.out.println(factorial(5));

//        int a= 0, b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        int n= 7;
//        fibo(a, b, n-2);

        int x = 2, n = 5;
        int ans = calPower(x,n);
        System.out.println(ans);

//        pw(0,2,5,1);

    }
//    Print 1 to 5 using recursion
    public static void number1to5(int n){
        if(n == 5+1){
            return;
        }
        System.out.println(n);
        number1to5(n+1);
    }

//    Print 5 to 1 using recursion
    public static void number5to1(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        number5to1(n-1);
    }

//    sum of all natural no.
    public static void sumNo(int i, int n, int sum){
        if(i == n){
            sum+= i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumNo(i+1, n, sum);
    }

//    factorial of nth no.
    public static int factorial(int n) {
        if(n == 1 || n == 0){
            return 1;
        }
        int factNum = factorial(n-1);
        int fact = n * factNum;
        return  fact;
    }

//    fibonacci series

    public static void fibo(int a, int b, int n) {
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibo(b, c, n-1);
    }

//    nth power x calculate
    public static int calPower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int xpowerNminus1 = calPower(x,n-1);
        int xPowN = x * xpowerNminus1;
        return xPowN;
    }

    public static void pw(int i, int n, int range, int temp){
        if(i == range){
            System.out.println(temp);
            return;
        }
        temp= temp * n;
        pw(i+1, n, range, temp);
    }
}
