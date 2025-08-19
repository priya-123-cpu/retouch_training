package Assesment;
import java.util.Scanner;

public class operator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input of x=");
        int x = sc.nextInt();

        System.out.println("Enter the input of y=");
        int y = sc.nextInt();

        System.out.println("Enter the input of z=");
        int z = sc.nextInt();

        if (x > y && y > z) {
            System.out.println("Hello");
        }

        if (z > y && z < x) {
            System.out.println("Java");
        }


        if ((y + 200) < x && (y + 150) < z) {
            System.out.println("Hello Java");
        }
    }
}
