//Importing the Scanner Class
import java.util.Scanner;
class Problem_2{
    static void main(){
        //Creating object for the Scanner class
        Scanner x = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        //Taking user input
        double a = x.nextDouble();
        double b = x.nextDouble();
        double c = x.nextDouble();
        //Finding out the greatest among them
        double g = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("The gratest number is: " + g);
        //Finding out the total of first digits
        int l1 = 0;
        int l2 = 0;
        int l3 = 0;
        while((a!=0) && (b!=0) && (c!=0)){
            l1 = (int)a%10;
            l2 = (int)b%10;
            l3 = (int)c%10;
            a = (int)a/10;
            b = (int)b/10;
            c = (int)c/10;
        }
        System.out.println(l1 + l2+ l3);
        
    }
}
