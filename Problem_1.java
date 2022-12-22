//Importing the Scanner Class
import java.util.Scanner;
class Problem_1{
    static void main() {
        //Creating object for the Scanner class
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        //Taking user input
        int a = x.nextInt();
        //Checking whether a number is 3 digit or not
        if(a>=100 && a<=999){
            //Separating digits from the number
            //Last
            int l = a%10;
            //First
            int f = a/100;
            //Middle
            int m = (a%10)/10;
            //Pointing out the totall of all the digits
            int s = l+f+m;
            System.out.println("The total of all the digits is: " + s);
            //Reversing the number
            int r = 0;
            int rev = 0;
            System.out.print("The reversed number is:\t");
            while(a!=0){
                 r = a%10;
                 rev = rev*10 + r;
                 a = a/10;
            }
            System.out.println(rev);
        }
    }
}