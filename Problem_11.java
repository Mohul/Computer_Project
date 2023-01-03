//Importing the Scanner Class
import java.util.Scanner;
class Problem_11 {
    static void main(){
        //Creating object for the Scanner class
        Scanner x = new Scanner(System.in);
        //Decalring the variable where sum is stored
        //Even
        int se = 0;
        //Odd
        int so = 0;
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 11; i++) {
            //Accepting the numbers to be added
            int n = x.nextInt();
            if(n%2 == 0){
                se = se + n;
            }
            else{
                so = so + n;
            }
        }
        System.out.println("The sum of even numbers is: " + se);
        System.out.println("The sum of odd numbers is: " + so);
    }
}
