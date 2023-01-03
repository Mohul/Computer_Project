//Importing the Scanner Class
import java.util.Scanner;
class Problem_10 {
    public static void main(String[]args){
        //Creating object for the Scanner class
        Scanner x = new Scanner(System.in);
        //Accepting three sides of the triangle as input
        System.out.println("Enter the length of 3 sides of the triangle");
        double a = x.nextDouble();
        double b = x.nextDouble();
        double c = x.nextDouble();
        //Checking whether it is a triangle or not
        if((a<(b+c)) && (b<(a+c)) && (c<(a+b))){
            //Checking the type of triangle formed
            if((a==b) && (b==c) && (a==c)){
                System.out.println("The triangle is equillateral");
            }
            else if((a==b)||(b==c)||(a==c)){
                System.out.println("The triangle is isosceles");
            }
            else{
                System.out.println("The triangle is scalene");
            }
        }
        else{
            System.out.println("Not a triangle");
        }
        }   
    }
