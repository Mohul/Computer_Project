//Importing the Scanner Class
import java.util.Scanner;
class Problem_7 {
    static void main(){
      //Creating object for the Scanner class
       Scanner x = new Scanner(System.in);
       //Designing the menu
       System.out.println("----------Menu----------");
       System.out.println("Press 1 for area of a square");
       System.out.println("Press 2 for area of a rectangle");
       System.out.println("Press 3 for area of a circle");
       //Excepting the choice
       System.out.println("Enter a number");
       int c = x.nextInt();
       //Determining the choice
       switch (c) {
        case 1:
            //Accepting the side of the square from the user
            System.out.println("Enter the side of the square");
            double s = x.nextDouble();
            //Calculating the area
            double a = Math.pow(s,2);
            System.out.println("The area of the square is: " + a);
            break;
        case 2:
            //Accepting the length of the rectangle from the user
             System.out.println("Enter the length of the rectangle");
             double l = x.nextDouble();
             //Accepting the breadth of the rectangle from the user
             System.out.println("Enter the breadth of the rectangle");
             double b = x.nextDouble();
             //Calculating the area
             double a1 = l*b;
             System.out.println("The area of the rectangle is: " + a1);
            break; 
        case 3:
            //Accepting the radius of the circle from the user
            System.out.println("Enter the radius of the circle");
            double r = x.nextDouble();
            //Calculating the area
            double a2 = 3.142 * Math.pow(r,2);
            System.out.println("The area of the circle is: " + a2);
            break; 
        default:
            System.out.println("Wrong number");
            break;
       }

    
}

}
