// Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

import java.io.NotActiveException;

public class evenDayInMonth {
  public static void main(String[] args) {
    int noOfDaysAugust = 31;
    int count = 0;
    for (int i = 1; i <= noOfDaysAugust; i++) {
      if (i % 2 == 0) {
        count = count + 1;
        System.out.println(count);
      }
    }
    System.out.println("Number of days kunal can go out with his friends are : " + count);

  }
}
