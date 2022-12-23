//Importing the Scanner Class
import java.util.Scanner;
  public class Problem_14 {
    static void main() {
         //Creating object for the Scanner class
         Scanner x = new Scanner(System.in);
         //Accepting a number from the user
         System.out.println("Enter a number");
         int n = x.nextInt();
         //Checking whether a number is duck or not
         String g;
         int re = 0;
         int r = 0;
         if(n>0){
            while(n!=0){
            r = n%10;
            n = n/10;
            if(r==0){
                System.out.println("The number is a duck number");
                break;
            }
         }
         }
       }
    }
