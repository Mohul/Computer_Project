//Importing the Scanner Class
import java.util.Scanner;
public class Problem_11 {
    public static void main(String[]args){
        //Creating object for the Scanner class
        Scanner x = new Scanner(System.in);
        //Decalring the variable where sum is stored
        //Even
        double se = 0.0;
        //Odd
        double so = 0.0;
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 11; i++) {
            //Accepting the numbers to be added
            double n = x.nextDouble();
            if(n%2 == 0){
                se = se + n;
            }
            else{
                so = so + n;
            }
        }
        System.out.println("The sum of even numbers is: " + se);
        System.out.println("The num of odd numbers is: " + so);
    }
}
