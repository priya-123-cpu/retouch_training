package Assesment;
import java.util.Scanner;

public class datatype_variables_averagesum {
    public static void main(String[] args) {



                Scanner sc=new Scanner(System.in);
                System.out.println("Enter The Input1:");
                int input1=sc.nextInt();
                System.out.println("Enter The Input2:");
                int input2=sc.nextInt();
                System.out.println("Enter The Input3:");
                int input3=sc.nextInt();
                int sum=input1+input2+input3;
                int n=3;
                // float average=sum of the inputs/no.of inputs
                int average=sum/n;
                //float average=sum/n;
                System.out.println("sum of the 3 inputs="+sum);
                System.out.println("Average of the 3 inputs:"+average);
            }
        }


