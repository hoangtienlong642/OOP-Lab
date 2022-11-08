import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class test {
    public static void main(String[] args) {
        int m=5,n=5;
        for (int i = 1; i <= m; i++){
            System.out.print( "\t");
            for (int j = 1; j <= n; j++){
                System.out.print( "a"+i+j+"\t");
            }
            System.out.print( "\n");
        }
    }
}
 