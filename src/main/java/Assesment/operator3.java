package Assesment;
import java.util.Scanner;

public class operator3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input of x=");
        int x=sc. nextInt();

        System.out.println("Enter the input of y=");
        int y=sc.nextInt();

        int exp1=(y * ( x / y + x / y));
        int exp2=(y * x / y + y * x / y);
        System.out.print(exp1+",");
        System.out.print(exp2);
    }
}
