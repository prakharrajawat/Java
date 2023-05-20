import java.util.Scanner;

public class leapYear {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter year :: ");

    int year = in.nextInt();
    if (year % 400 == 0 || year % 4 == 0) {
      System.out.println("leap year");
    } else

    {
      System.out.println("Not a leap year");
    }

  }
}
