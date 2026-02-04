package Lab006_TerinaryOperator;

public class CLI_Argspassing_Lab_003 {
  public static void main(String[] args) {

        String input1 =   args[0];
        //String input2 =   args[1];
        //String input3 =   args[2];
      System.out.println(input1 instanceof String);

        System.out.println(input1);
        int age=Integer.parseInt(input1);
      System.out.println("The Age is "+age);
      String result= (age<18)?"Minor":(age<60)?"Adult":"Senior Citizen";
      System.out.println("the result is "+result);
        //System.out.println(input2);
       // System.out.println(input3);
    }
}
