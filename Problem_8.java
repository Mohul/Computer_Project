
//Importing the Scanner Class
import java.util.Scanner;
class Problem_8{
    static void main(){
        //Creating object for the Scanner class
        Scanner x = new Scanner(System.in);
        //Accepting the temperature as Celcius
        System.out.println("Enter the temperature in Celcius");
        double c = x.nextDouble();
        //Converting into ferhenheit
        double f = (c * 1.8) + 32.0 ;
        System.out.println("Temperature in ferhenheit: " + f);
    }
}
