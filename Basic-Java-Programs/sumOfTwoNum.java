import java.util.Scanner;

public class sumOfTwoNum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Two Numbers ::");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int sum = num1 + num2;
    System.out.println("Sum Of Two Numbers ::" + sum);
  }
}