package Assesment;

public class relational2 {
    public static void main(String[] args){

        int age = 20;
        int score = 75;
        int passmark = 50;
        boolean result =score>= passmark;
        boolean result1 = (age>=18) && result;

        System.out.println("Did the student pass:"+ result);
        System.out.println("Is the student an adult and passed:"+ result1);
    }
}
