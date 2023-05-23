import java.util.Scanner;

public class primeNum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int num = in.nextInt();
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        System.out.println("Not a Prime Number");
      } else {
        System.out.println("Prime Number");

      }
    }
  }
}
