//Importing the Scanner Class
import java.util.Scanner;
class Problem_9 {
    static void main(){
        //Creating object for the Scanner class
        Scanner x = new Scanner(System.in);
        //Accepting a number from the user
        System.out.println("Enter a number");
        int a = x.nextInt();
        //Reversing the number
        int r = 0;
        int re = 0;
        int a2 = a;
        while(a!=0){
            r = a%10;
            re = re*10 + r;
            a/=10;   
        }
        //Checking whether the number is palindrome
        boolean c = re == a2;
        String z = (c)?"The number is pallindrome":"The number is not pallindrome";
        System.out.println(z);
    }
    
}


