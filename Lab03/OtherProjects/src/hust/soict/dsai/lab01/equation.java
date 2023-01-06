package hust.soict.dsai.lab01;
import java.util.Scanner;
import java.lang.Math;
public class equation {
    public static void FirstDegreeOneVariable(Scanner keyboard){

        System.out.println("You chosen the first-degree equation (linear equation) with one variable:\n\t ax + b = c\nPlease enter value of a: ");
        double a = keyboard.nextDouble();

        System.out.println("Please enter value of b: ");
        double b = keyboard.nextDouble();

        System.out.println("Please enter value of c: ");
        double c = keyboard.nextDouble();

        double result = (c-b)/a;

        System.out.println("You entered equation: "+a+"*x +"+b+" = "+c+"\nAnd the result is x = "+result);
    }   
    public static void FirstDegreeTwoVariable(Scanner keyboard){
        System.out.println("You chosen the system of first-degree equations (linear system) with two variables:\n\t a11x1 + a12x2 = b1\n\t a21x1 + a22x2 = b2\nPlease enter value of a11, a12, a21, a22: ");
        double a11 = keyboard.nextDouble();
        double a12 = keyboard.nextDouble();
        double a21 = keyboard.nextDouble();
        double a22 = keyboard.nextDouble();

        System.out.println("Please enter value of b1, b2: ");
        double b1  = keyboard.nextDouble();
        double b2  = keyboard.nextDouble();
            
        double D,D1,D2,x1,x2;
        D  = a11*a22 - a21*a12;
        D1 = b1 *a22 - b2 *a12;
        D2 = a11*b2  - a21*b1 ;

        if (D == 0 ){
            if (D1 == 0) 
                System.out.println("The system  has an infinite number of solutions");
            else 
                System.out.println("The system is indeterminate");
        }
        else {
            x1 = D1/D ;
            x2 = D2/D ;
            System.out.println("The system has one solution: x1 = "+x1+" and x2 = "+x2);
        }
    }
    public static void SecondDegreeOneVariable(Scanner keyboard){

        System.out.println("You chosen the second-degree equation with one variable:\n\t ax^2 + bx + c = 0\nPlease enter value of a: ");
        double a = keyboard.nextDouble();

        System.out.println("Please enter value of b: ");
        double b = keyboard.nextDouble();

        System.out.println("Please enter value of c: ");
        double c = keyboard.nextDouble();

        double delta = b*b - 4*a*c;
        
        if (delta < 0)
            System.out.println("The equation has no solution.");   
        else if (delta == 0 ){
            double result = - b/(2*a);
            System.out.println("The equation has one solution: x = " + result);
        }
        else {
            double x1 = ( - b + Math.sqrt(delta) / (2*a));
            double x2 = ( - b - Math.sqrt(delta) / (2*a));
            System.out.println("The equation has two solutions: x1= "+x1 + ", x2= "+x2);
        }

    }   
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Choose type of the equation: \n 1.The first-degree equation (linear equation) with one variable\n 2.The system of first-degree equations (linear system) with two variables\n 3.The second-degree equation with one variable");
        int option = keyboard.nextInt();
        if (option == 1) FirstDegreeOneVariable(keyboard);
        else if (option == 2) FirstDegreeTwoVariable(keyboard);
        else if (option == 3) SecondDegreeOneVariable(keyboard);
        else System.out.println("Your choice is not valid");
        System.exit(0);
    }
}
 