
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahmaa1808
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // scanner to get user input
        Scanner input = new Scanner(System.in);

        // user starts at 1
        double total = 1;

        //loop
        while (total < 100) {
            // ask user to input their sum of the dice
            System.out.println("Enter sum of dice");
            Double sum = input.nextDouble();

            //if sum is zero
            if (sum == 0) {
                System.out.println("You Quit!");

            }

            // calculations for the square the user will land on for every turn   
            total = sum + total;

            // at the end of a turn if user lands on square that encounters a ladder or snake
            //ladder
            if (total == 9) {
                total = 34;
            }

            //ladder
            if (total == 40) {
                total = 64;
            }

            //snake
            if (total == 54) {
                total = 19;
            }

            //ladder
            if (total == 67) {
                total = 86;
            }

            //snake
            if (total == 90) {
                total = 48;
            }

            // snake
            if (total == 99) {
                total = 77;
            }

            // output the square the user is on after every turn
            System.out.println("You are now on square " + total);

            // when user lands on square 100, end game
            if (total == 100) {
                System.out.println("You are now on square 100. You win!");
            }
        }
    }

}
