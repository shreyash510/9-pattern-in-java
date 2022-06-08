public class advRecursion {
  public static void main(String arg[]) {
    // int n = 3;
    // tower(n , "A", "B", "C");

    // String str = "Pappu";
    // int i = str.length()-1;
    // rev(str, i);

    String str = "abaacdaefaah";
    occ(str, 0);
  }

  public static void tower(int n, String a, String b, String c) {
    if (n == 1) {
      System.out.println("Dist " + n + " transfer " + a + " to " + c);
      return;
    }
    tower(n - 1, a, c, b);
    System.out.println("Dist " + n + " transfer " + a + " to " + c);
    tower(n - 1, b, a, c);
  }

  // Reverse string using recursion

  public static void rev(String str, int i) {
    if (i == -1) {
      return;
    }
    System.out.print(str.charAt(i));
    rev(str, i - 1);
  }

  // find first and last occrence

  public static int first = -1;
  public static int last = -1;

  public static void occ(String str, int i) {

    if (i == str.length()) {
      System.out.println("First: " + first + " Last :" + last);
      return;
    }
    char currChar = str.charAt(i);
    if (currChar == 'a') {
      if (first == -1) {
        first = i;
      } else {
        last = i;
      }
    }
    occ(str, i+1);
  }
}