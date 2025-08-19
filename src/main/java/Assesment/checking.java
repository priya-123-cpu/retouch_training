package Assesment;
import java.util.Scanner;

public class checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input of a=");
        int a = sc.nextInt();
        System.out.println("Enter the input of b=");
        int b = sc.nextInt();
        boolean x= (a < b) ? true : false;
        int y = ( a > b) ? a : b ;
        System.out.println(x);
        System.out.println(y);

    }
}
