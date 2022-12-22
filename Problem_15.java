//Importing the Scanner Class
import java.util.Scanner;
public class Problem_15 {
    public static void main(String[]args){
       //Creating object for the Scanner class
       Scanner x = new Scanner(System.in);
       //Accepting a number from the user
       System.out.println("Enter a number: ");
       int n = x.nextInt();
       //Checking whether the number is a buzz number or not
       if((n%10 == 7) || (n%7 == 0)){
         System.out.println("The number is a buzz number");
       }
       else{
        System.out.println("The number is not a buzz number");
       }
    }
}

