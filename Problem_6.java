//Importing the Scanner Class
import java.util.Scanner;
public class Problem_6 {
    static void main(){
        //Creating object for the Scanner class
        Scanner x = new Scanner(System.in);
        //Accepting the kilometers travelled
        System.out.println("Enter the kilometeres travelled");
        double k = x.nextDouble();
        //Determining a variable in which the fare is to be stored
        double f = 0.0;
        //Calculating the fare
        if(k>0 && k<=5){
            f = k*10.0;
        }
        else if(k>5 && k<=15){
            f = (5*10.0) + (k-5) * 8.0;
        }
        else if(k>15 && k<=25){
            f = (5*10.0) + (10*8.0) + (k-15) * 7.0;
        }
        else if(k>25){
            f = (5*10.0) + (10*8.0) + (10*7.0) + (k-25) * 5.0;
        }
        System.out.println("The total bus fare is: " + f);
    }
}
