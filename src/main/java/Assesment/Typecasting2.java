package Assesment;

public class Typecasting2 {
    public static void main(String[] args){

        double x =22.7;
        int y =4;
        int modResult = (int)x % y;


        double sumResult = x + (double)y;


        boolean result = (int)x == y * 5;


        boolean result1 = x > 20 && y < 10;


        System.out.println("(int)x % y: " + modResult);
        System.out.println("x + (double)y: " + sumResult);
        System.out.println("Is (int)x equal to y * 5?: " + result);
        System.out.println("Is x > 20 and y < 10?: " + result1);
    }
}

