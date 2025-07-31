package Assesment;

public class typecasting {
    public static void main(String[] args){

        int a =9;
        double b = 4.0;
        double sum =(double) a+b;
        double division= a/b;
        boolean result = a > (int) b;
        boolean result1 = (a % 3 == 0) && (b > 2.5);

        System.out.println("sum(a+b):" +sum);
        System.out.println("division(a/b):" +division);
        System.out.println("Is a>(int)b?:" +result);
        System.out.println("Is a divisible by 3 and b>2.5?:" +result1);




    }
}
