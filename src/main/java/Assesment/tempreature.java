package Assesment;
import java.util.Scanner;

public class tempreature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input of x=");
        double temperature=sc. nextDouble();
        if(temperature > 100){
            System.out.println("You Have A Fever");
        }
        else {
            System.out.println("You Don't Have A Fever");
        }
    }
}


