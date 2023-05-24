import java.util.Scanner;

public class subSumAndProd {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int rem, sum = 0, prod = 1;
    while (n > 0) {
      rem = n % 10;
      sum = sum + rem;
      prod = prod * rem;
      n = n / 10;
    }
    System.out.println(prod - sum);
  }
}
