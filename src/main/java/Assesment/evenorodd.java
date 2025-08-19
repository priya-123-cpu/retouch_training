package Assesment;
import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input Array Size of arrsize=");
        int arrsize = sc.nextInt();
        int[] arr = new int[arrsize];
        int Evensum = 0;
        int Oddsum = 0;
        System.out.println("Enter The N Values:");
        for (int i = 0; i <= arrsize-1; i++) {
            arr[i]=sc.nextInt();
            if (arr[i]% 2 == 0) {
                Evensum = Evensum + arr[i];
                System.out.println("Sum Of The Even Number:" + Evensum);
            }
            else {
                Oddsum = Oddsum + arr[i];
                System.out.println("Sum Of The Odd Number:" + Oddsum);
            }
            // System.out.println("Sum Of The Even Number:" + Evensum);
            //  System.out.println("Sum Of The Odd Number:" + Oddsum);
        }
    }
    }

