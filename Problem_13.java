//Importing the Scanner Class
import java.util.Scanner;
class Problem_13{
    static void main() {
        //Creating object for the Scanner class
        Scanner x = new Scanner(System.in);
        //Accepting two numbers from the use
        System.out.println("Enter 2 numbers");
        int a = x.nextInt();
        int b = x.nextInt();
        int c = 0;
        int hcf = 1;
        //Finding the HCF
        for (int i = 1; i < a; i++) {
            if((a%i==0) && (b%i==0)){
               hcf =  i;
            }      
        }
        System.out.println("The HCF of the number is: " + hcf);
        //Finding the LCM 
        int lcm = (a*b)/hcf;
        System.out.println("The LCM of the number is: " + lcm);
    }
}