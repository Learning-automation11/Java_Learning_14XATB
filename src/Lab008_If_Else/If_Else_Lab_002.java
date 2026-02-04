package Lab008_If_Else;

public class If_Else_Lab_002 {
    public static void main(String[] args) {
        String user_input= args[0];
        int age= Integer.parseInt(user_input);
        System.out.println(age);
        if(age>18){
            System.out.println("Yes you can vote");
        }else{
            System.out.println("No , You have to be 18 years old to cast vote;");
        }

    }
}
