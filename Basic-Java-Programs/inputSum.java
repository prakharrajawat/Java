import java.util.Scanner;

public class inputSum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int num;
    int sum = 0;
    while ((num = in.nextInt()) != 0) {
      System.out.println("Enter value for input :: ");
      sum = num + sum;
    }
    System.out.println("Sum of inputed integer are : " + sum);
  }
}
