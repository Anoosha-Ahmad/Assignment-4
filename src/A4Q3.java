
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahmaa1808
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner to get user input 
        Scanner input = new Scanner(System.in);

        // asking the user to input the numbers on different lines
        //asking user to input first number and scanning the number
        System.out.println("Please enter your first number");
        Double number1 = input.nextDouble();

        //asking user to input second number and scanning the number
        System.out.println("Please enter your second number");
        Double number2 = input.nextDouble();

        //asking user to input second number and scanning the number
        System.out.println("Please enter your third number");
        Double number3 = input.nextDouble();

        //asking user to input second number and scanning the number
        System.out.println("Please enter your fourth number");
        Double number4 = input.nextDouble();

        //output of the numbers inputed by user
        System.out.println("Your numbers were " + number1 + ", " + number2 + ", " + number3 + ", " + "and " + number4);

    }
}
