import java.util.Scanner;
import java.lang.Math;


public class quadraticEquation {

    public static void main(String[] args) {
        float a,b,c;
        float root, root1,root2;
        double D;

        System.out.println("Give me the a, b and c");
        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextFloat();
        b = keyboard.nextFloat();
        c = keyboard.nextFloat();
        
        D = b*b - 4*a*c;

        if (D>0) {

            root1 = (float) ((-b + Math.sqrt(D)) / 2 * a);
            root2 = (float) ((-b - Math.sqrt(D)) /2*a);
            System.out.println("The roots are : " + root1 + " and " + root2);
            
        } else if (D==0) {
      
            root = root1 = root2 = -b/2*a;
            System.out.println("The roots are : " + root);
        } else if (D<0) {
            System.out.println("Equation impossible.");
        }
        keyboard.close();
    }

    

   
}