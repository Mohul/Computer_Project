//Importing the Scanner Class
import java.util.Scanner;
class Test{
    static void main(){
        //Creating object for the Scanner class
        Scanner x = new Scanner(System.in);
        //Accepting the measurement in feet
        System.out.println("Enter measurement in foot");
        double ft = x.nextDouble();
        //Converting into yard
        //1 ft = 0.333333 yard
        double y = ft*0.333333;
        //Converting into inch
        double i = ft*12.0;
        System.out.println("Measurement in yard: " + y);
        System.out.println("Measurement in inch: " + i);
    }
}
