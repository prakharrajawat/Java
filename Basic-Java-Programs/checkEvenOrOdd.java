import java.util.Scanner;

public class checkEvenOrOdd {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Number :: ");
    int num = in.nextInt();
    if (num % 2 == 0) {
      System.out.println("Even Number");
    } else {
      System.out.println("Odd Number");
    }
  }
}
