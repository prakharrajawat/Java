/*
      * Question 1. You are planning a car trip so you post on a carpooling website
      * in order to share the cost of the trip.
      * If you have 0 passengers the carpool site does not charge anything and you
      * alone pay the full cost of the trip. If you have 1 or more passengers the
      * carpool site adds a $1 fee to the cost of the trip and evenly divides the
      * total cost ($1 fee + gas) among the passengers and you. You want to write a
      * program that calculates the cost you have to pay. The program should read the
      * number of passengers (an integer) and the cost of gas for the trip (a decimal
      * number). The program should then print the cost that you have to pay (a
      * decimal number) with 2 digits after the decimal point.
      */

import java.util.Scanner;

public class first {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    float gas = in.nextFloat();
    int passengers = in.nextInt();
    float cost = 0;
    passengers = 0;

    if (passengers == 0) {
      cost = gas;
    } else {
      cost = (gas + 1) / (passengers + 1);
    }
    System.out.println("Cost ::0.2f " + cost);
  }
}
