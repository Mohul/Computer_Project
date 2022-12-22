public class Problem_12 {
    static void main(){
        //Variables
       int n1 = 0;
       int n2 = 1;
       int n3;
       //Printing first 2 digits
       System.out.print(n1 + " " + n2);
       //Printing rest digits
       for(int i = 2;i<10;i++){
           n3 = n1 + n2;
           System.out.print(" " + n3);
           n1 = n2;
           n2 = n3;
       }
    }
}
