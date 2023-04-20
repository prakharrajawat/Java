import java.util.Scanner;

public class largestnumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();

    if (a > b && a > c) {
      System.out.println("a is greater");

    } else if (c > a && c > b) {
      System.out.println("c is greater");
    } else {
      System.out.println("b is greater");
    }

  }
}