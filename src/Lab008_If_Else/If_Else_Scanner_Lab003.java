package Lab008_If_Else;

import java.util.Scanner;

public class If_Else_Scanner_Lab003 {
  public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter age: ");
      int age = scanner.nextInt();

      System.out.println("The value is " + age);

      if (age > 18) {
          System.out.println("Please come to Las Vegas");
      } else {
          System.out.println("Please don't come to Las Vegas");
      }
    }
}
