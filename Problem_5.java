//Importing the Scanner Class
import java.util.Scanner;
public class Problem_5 {
    static void main(){
        //Creating object for the Scanner class
        Scanner x = new Scanner(System.in);
        //Accepting two numbers
        System.out.println("Enter two numbers");
        double a = x.nextInt();
        double b = x.nextInt();
        //Designing the menu
        System.out.println("----------Menu----------");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        //Accepting a number from the user
        System.out.println("Enter a number: ");
        int c = x.nextInt();
        //Determining cases
        switch (c) {
            case 1:
                System.out.println("The sum is: " + (a+b));
                break;
            case 2:
                System.out.println("The difference is: " + (a-b));
                break;
            case 3:
                System.out.println("The product is: " + (a*b));  
                break;
            case 4:
                System.out.println("The quotiebt is: " + (a/b));
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
        
    }
}
