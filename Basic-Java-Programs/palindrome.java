import java.util.Scanner;

public class palindrome {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int reverserNum = 0;
    int temp = n;
    while (temp > 0) {
      int lastdigit = temp % 10;
      reverserNum = reverserNum * 10 + lastdigit;
      temp = temp / 10;
    }
    if (reverserNum == n) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a Palindrome");
    }
  }
}