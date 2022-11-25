package hust.soict.dsai.lab01;
import java.util.Scanner;

import java.lang.Math;

public class MatrixSum {
    public static void PrintMatrix( double[][] matrix, int m, int n){                   
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print( "\t" + matrix[i][j] );
            }
            System.out.print( "\n");
        }
    }
    public static double[][] RandMatrix (int m, int n) {
        double[][] matrix = new double[m][n];
        
        for (int i = 0; i < m; i++){
            for (int j = 0; j <n; j++) {
                matrix[i][j] = Math.round ((Math.random() *1000)+1);
                matrix[i][j] = matrix[i][j] /100;
            }
        }  
        return matrix;
    }
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int m  ,n ,option = 0;
        do{
            System.out.println("Do you want to enter the matrices?\n 1.Yes\n 2.No");
            String str = keyboard.next();
            try {
                option = Integer.parseInt(str); }
            catch (NumberFormatException nfe) {
                System.out.println("Invalid value");
                continue;
            } 
            option = Integer.parseInt(str);
            if (option == 1 || option == 2){  
                if(option == 1 ){
                    System.out.println("Please enter number of row of matrix");         // nhập số hàng
                    m = keyboard.nextInt();
                    System.out.println("Please enter number of collumn of matrix");     // Nhập số cột
                    n = keyboard.nextInt();
                    
                    System.out.println("The matrix's format: " );                    // In ra format ma trận
                    for (int i = 1; i <= m; i++){
                        System.out.print( "\t");
                        for (int j = 1; j <= n; j++){
                            System.out.print( "a"+i+j+"\t");
                        }
                        System.out.print( "\n");
                    }
                
                    // Nhập dữ liệu ma trận 1
                    
                }
                else {
                    m = (int) (Math.random() *9)+1;
                    n = (int) (Math.random() *9)+1;
                    
                }
                double matrix1[][] = new double[m][n];
                double matrix2[][] = new double[m][n];
                double matrix[][] = new double[m][n];
                
                if (option == 1){
                    System.out.println("Enter entries of first matrix in order from left to right: \nExample: a11 a12 a13 a21 a22 a23 ...");
                    for (int i = 0; i < m; i++){
                        for (int j = 0; j <n; j++) {
                            matrix1[i][j] = keyboard.nextDouble();
                        }
                    }

                    System.out.println("Enter entries of second matrix in order from left to right: \nExample: a11 a12 a13 a21 a22 a23 ...");
                    for (int i = 0; i < m; i++){
                        for (int j = 0; j <n; j++) {
                            matrix2[i][j] = keyboard.nextDouble();
                        }
                    }   
                }
                else if (option == 2)
                {
                    matrix1 = RandMatrix(m,n);
                    matrix2 = RandMatrix(m,n);
                }
                
                System.out.println("The first matrix: " );                    // In ma tran 1
                PrintMatrix(matrix1,m,n); 

                System.out.println("The second matrix: " );                   // In ma tran 2
                PrintMatrix(matrix2,m,n);            

                for (int i = 0; i < m; i++){
                    for (int j = 0; j <n; j++) {
                        matrix[i][j] = matrix1[i][j] + matrix2[i][j];
                        matrix[i][j] = Math.round(matrix[i][j]*100);
                        matrix[i][j] = matrix[i][j]/100;
                    }
                }   
                
                System.out.println("The sum of two matrices: " );                   // In ma tran 2
                PrintMatrix(matrix,m,n);     
            }
            else {
                System.out.println("Invalid choice");
            }
        } while ( option != 1 && option != 2 );
        keyboard.close();
    }

}
