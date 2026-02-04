package Lab007_IncDecOp;

public class PostIncreOp_Lab_002 {
  public static void main() {
      int a=10;
      System.out.println(a++ + ++a);
      int b= a++;// first it will assign value to b and it wud increase

      System.out.println(a);//11
      System.out.println(b);//10
      System.out.println(a+b);


  }

}
