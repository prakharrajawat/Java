import java.util.Scanner;

public class inputOccurence {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int numOccur = in.nextInt();
    int i = 1;
    int count = 0;
    while (i <= 10) {
      System.out.println("Input No.");
      int n = in.nextInt();
      if (n == numOccur) {
        count++;
      }
      i++;
    }
    System.out.println("No. of Occurences ::");
    System.out.println(count);
  }
}
