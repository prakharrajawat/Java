import java.util.Scanner;

public class fibonacchiSeries {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter value for n :: ");
    int n = in.nextInt();
    int firstTerm = 0;
    int secondTerm = 1;
    for (int i = 1; i <= n; i++) {
      System.out.println(firstTerm + " ");
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
