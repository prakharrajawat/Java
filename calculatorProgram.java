import java.util.Scanner;

public class calculatorProgram {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int i = 0;
    int ans = 0;
    while (true) {
      // if input char is x or X then exit program!!
      // input two integers
      System.out.print("Enter two Numbers :: ");
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      // input operator
      System.out.print("Enter Operator ::");
      char ch = in.next().trim().charAt(0);

      if (ch == '+' || ch == '-' || ch == '%' || ch == '/' || ch == '*') {
        if (ch == '+') {
          ans = num1 + num2;
        }
        if (ch == '-') {
          ans = num1 - num2;
        }
        if (ch == '*') {
          ans = num1 * num2;
        }
        if (ch == '/' && num2 != 0) {
          ans = num1 / num2;
        }
        if (ch == '%') {
          ans = num1 % num2;
        }
      } else if (ch == 'x' || ch == 'X') {
        System.out.println("Exit Operations");
        break;
      } else {
        System.out.print("Invalid Operaion !!");
      }
      System.out.println(ans);
    }
  }
}
