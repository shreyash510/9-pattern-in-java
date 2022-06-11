import java.util.Map;

public class advRecursion {
  public static void main(String arg[]) {
    // int n = 3;
    // tower(n , "A", "B", "C");

    // String str = "Pappu";
    // int i = str.length()-1;
    // rev(str, i);

    // String str = "abaacdaefaah";
    // occ(str, 0);

    // int myArr[] = { 1, 2, 3, 4, 5 };
    // System.out.println(sortArr(0, myArr));

    // String str = "axbcxxd";
    // String newString = "";
    // moveX(0, str, 0, newString);

    String str = "abbccda";
    removeDub(str, 0, "");
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
    occ(str, i + 1);
  }

  // check Array is sorted or not

  public static boolean sortArr(int i, int arr[]) {
    if (i == arr.length - 1) {
      return true;
    }
    if (arr[i] < arr[i + 1]) {
      return sortArr(i + 1, arr);
    } else {
      return false;
    }
  }

  // move all 'x' to the end of the string

  public static void moveX(int i, String str, int count, String newString) {
    // if (i == str.length()) {
    //   for(int j = 0; j<count; j++){
    //     newString+='x';
    //   }
    //   System.out.println(newString);
    //   return;
    // }

    // char currentChar = str.charAt(i);
    // if (currentChar == 'x') {
    //   count++;
    //   moveX(i + 1, str, count, newString);
    // } else {
    //   newString += currentChar;
    //   moveX(i + 1, str, count, newString);
    // }

    // System.out.println('z'-'b');
  }
  public static boolean myArr[] = new boolean[25];
  public static void removeDub(String str, int i, String newString){
      if(i == str.length()){
        System.out.println(newString);
        return;
      }
      char currentChar = str.charAt(i);
      if(myArr[currentChar - 'a']){
          removeDub(str, i+1, newString);
      }else{
        newString += currentChar;
        myArr[currentChar - 'a']= true;
        removeDub(str, i+1, newString);
      }

  }
}