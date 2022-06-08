public class advRecursion {
  public static void main(String arg[]){
      int n = 3;
        tower(n , "A", "B", "C");
  }

  public static void tower(int n, String a, String b, String c){
      if(n == 1){
          System.out.println("Dist "+n+" transfer "+a+" to "+ c);
          return;
      }
      tower(n-1, a, c, b);
      System.out.println("Dist "+n+" transfer "+a+" to "+ c);
      tower(n-1, b, a, c);
  }
}