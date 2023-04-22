import java.util.Scanner;

public class switchCase {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int day = in.nextInt();

    switch (day) {
      case 1 ->
        System.out.println("Monday");
      case 2 ->
        System.out.println("Tuesday");
      case 3 ->
        System.out.println("Wednesday");
      case 4 ->
        System.out.println("Thrusday");
      case 5 ->
        System.out.println("Friday");
      case 6 ->
        System.out.println("Saturday");
      case 7 ->
        System.out.println("Sunday");
    }

    // String fruit = in.next();

    // switch (fruit) {
    // case "apple" -> System.out.println("It is red and sweet in taste");
    // case "mango" -> System.out.println("It is king of fruit");
    // case "guava" -> System.out.println("It is green in color");
    // default -> System.out.println("Enter a valid case !! ");
    // }
  }
}
