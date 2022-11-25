package hust.soict.dsai.lab01;
import java.util.Arrays;
import java.util.Scanner;


public class SortArray {
    public static double[] SelfInput(Scanner keyboard){
        System.out.println("Enter length of the array ");
        String str = keyboard.next();
        try {
            int n = Integer.parseInt(str); }
        catch (NumberFormatException nfe) {
            System.out.println("Invalid value");
            return null;
        } 
        int n1 = Integer.parseInt(str);
        double array[] = new double[n1];
        for (int i=0; i< n1; i++) {
            System.out.println("Enter the "+(i+1)+"th element");
            array[i] = keyboard.nextDouble();
        }
        return array;
    }
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("Do you want to enter the array?\n 1.Yes\n 2.No");

            String str = keyboard.next();
            try {
                option = Integer.parseInt(str); }
            catch (NumberFormatException nfe) {
                System.out.println("Invalid value");
                continue;
            } 
            option = Integer.parseInt(str);
            if (option == 1 || option == 2){  
                double[] NewArray ;
                if(option == 1 ){
                    do{
                        NewArray = SelfInput(keyboard) ;    
                    } while (NewArray==null);
                }
                else {
                    NewArray = new double[] {1225.1, 344, 6, 235.9, 900, 112, 45.1, 67, 79.19};
                }
                System.out.println("Array unsort: " + Arrays.toString(NewArray));
                Arrays.sort(NewArray); 
                System.out.println("Array sorted: " + Arrays.toString(NewArray));
                double sum = 0, average;
                for (int i = 0; i< NewArray.length; i++){
                    sum += NewArray[i];
                };
                average = sum /NewArray.length;
                System.out.println("The sum is " + sum+"\nThe average is " + average);
            }
            else {
                System.out.println("Invalid choice");
            }
        } while ( option != 1 && option != 2 );
    };
}
