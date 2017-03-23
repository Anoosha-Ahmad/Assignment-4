
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahmaa1808
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // scanner to get user input
        Scanner input = new Scanner(System.in);

        // asking the user to input their number
        System.out.println("Please enter the measurement in inches that you wish to convert:");

        // scanning their number into a variable
        Double number = input.nextDouble();

        // convert their number to cm
        Double answer = (number * 2.54);

        // output of the calculation of the conversion 
        System.out.println(number + " inches is the same as " + answer + " cm");


    }
}
