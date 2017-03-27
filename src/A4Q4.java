
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahmaa1808
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner to get user input
        Scanner input = new Scanner(System.in);

        //asking the user to input expenses
        System.out.println("How much does the food for prom cost?");
        Double food = input.nextDouble();

        System.out.println("How much does the DJ cost?");
        Double DJ = input.nextDouble();

        System.out.println("How much does it cost to rent the hall?");
        Double hall = input.nextDouble();

        System.out.println("How much does decorations cost?");
        Double decorations = input.nextDouble();

        System.out.println("How much does it cost for staff?");
        Double staff = input.nextDouble();

        System.out.println("How much for miscellaneous costs?");
        Double miscellaneous = input.nextDouble();

        //calculate total cost of expenses
        Double cost = (food + DJ + hall + decorations + staff + miscellaneous);

        // calculate total nummber of tickets to be sold to break even
        Double tickets = (cost / 35);

        //rounding the number
        tickets = Math.ceil(tickets);

        //output the total cost and the number of tickets that need to be sold to break even
        System.out.println("The total cost is $ " + cost + ". You will need to sell " + tickets + " tickets to break even");

    }
}
