package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class calculator {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";
        
        strNum1 = JOptionPane.showInputDialog(null,"Please enter the first number: ","Input the fisrt number",JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        
        strNum2 = JOptionPane.showInputDialog(null,"Please enter the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2 + ".";

        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers" ,JOptionPane.INFORMATION_MESSAGE);
        
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum, product, quotient, difference;
        
        sum         = num1 + num2;
        product     = num1 * num2;
        difference  = num1 - num2;
        quotient    = num1 / num2;

        strNotification = "The sum is " + sum + " and the difference is " + difference + " and the quotient is " + quotient + " and the product is " + product;
        JOptionPane.showMessageDialog(null, strNotification, "Show the result" ,JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
