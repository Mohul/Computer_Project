import java.util.Scanner;
class Problem_4 {
    static void main(){
        //Creating object for the Scanner class
        Scanner x = new Scanner(System.in);
        //Accepting three numbers from the user
        System.out.println("Enter 3 numbers");
        double a = x.nextDouble();
        double b = x.nextDouble();
        double c = x.nextDouble();
        //Finfing their sum without +
        double s = a-(-b)-(-c);
        System.out.println("Their sum is: " + s);
    }
}
