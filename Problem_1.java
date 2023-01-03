//Importing the Scanner Class
import java.util.Scanner;
class Problem_1{
    static void main() {
        //Creating object for the Scanner class
        Scanner x = new Scanner(System.in);
        int n,d,s = 0,rev = 0;
        //Excepting a 3 digit number from the user
        System.out.println("Enter any Triple digit number");
        n = x.nextInt();
        //Finding the sum and reversing the number
        if(a>=100 && a<=999){
            while(a!=0){
                d = n%10;
                s = s+d;
                rev = rev * 10 + d;
                n/ = 10;
            }
            System.out.println("The total of all digits: " + s);
            System.out.println("Reverse of the number: " + rev);
        }
    }
}
