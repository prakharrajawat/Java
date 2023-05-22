import java.util.Scanner;

public class simpleInterest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter value for principal,rate and interest :: ");
    int p = in.nextInt();
    int r = in.nextInt();
    int t = in.nextInt();

    int simpleInterest = (p * r * t) / 100;
    System.out.println(simpleInterest);
  }
}
