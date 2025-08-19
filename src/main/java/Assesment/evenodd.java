package Assesment;

public class evenodd {
    public static void main(String[] args) {

        int num = 6;
        // if number is even or odd we use switch

        switch(num % 2){
            case 0:
                System.out.println("number is an even number");
                break;
            case 1:
                System.out.println("number is an odd number");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
