package Assesment;
import java.util.Scanner;

public class operator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Input X:");
        int x=sc.nextInt();
        System.out.println("Enter The Input Y:");
        int y=sc.nextInt();
        int exp1=(x*y/x);
        int exp2=(x*(y/x));
        System.out.print(exp1+",");
        System.out.print(exp2);

    }
}

