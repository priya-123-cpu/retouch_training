package Assesment;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input of a=");
        int a = sc.nextInt();
        int factorial=1;
        for(int i=a;i>=1;i--){
            factorial = factorial*i;
            //System.out.println(factorial); 

        }
        System.out.println("The Factorial Of Number="+factorial);
    }
}
