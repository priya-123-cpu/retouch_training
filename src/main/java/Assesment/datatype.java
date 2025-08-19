package Assesment;
import java.util.Scanner;

public class datatype {
    public static void main(String[] args) {




                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the cost of the pencil=");
                float pencil=sc.nextFloat();
                System.out.println("Enter the cost of the pen=");
                float pen=sc.nextFloat();
                System.out.println("Enter the cost of the Eraser=");
                float eraser=sc.nextFloat();
                float sum=pencil+pen+eraser;
                float gst=0.18f*100;
                float output=sum+gst;
                System.out.println("Total Cost Of The Items Without Gst:"+sum);
                System.out.println("Total Cost Of The Items With Gst:"+output);


            }
        }


