package Lab008_If_Else;

import java.util.Scanner;

public class If_Else_Scanner_Lab005 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a day from 1 to 7");
        if(scanner.hasNextInt()){
            int day= scanner.nextInt();
            System.out.println("The Day user entered "+day);
            switch (day){
                case 1:
                    System.out.println("This is Monday");
                    break;

                case 2 :
                    System.out.println("This is Tuesday");
                   break;

                case 3:
                    System.out.println("This is WEDnessday");
                    break;

                case 4 :
                    System.out.println("This is Thurs day");
                    break;

                case 5 :
                    System.out.println("This is Friday");
                    break;

                case 6 :
                    System.out.println("This is Saturday");
                    break;

                case 7:
                    System.out.println("This is Sunday");
                    break;
                default:

                    System.out.println(" You need to enter in between 1 to 7 only");
                    break;

            }
        }else {
            System.out.println("You need to enter only int");
        }
    }
}
