import java.util.Scanner;

public class factorNum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int num = in.nextInt();
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        {
          System.out.println("Factors of" + num + " are : " + i);
        }
      }
    }

  }
}