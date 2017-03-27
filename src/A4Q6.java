
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahmaa1808
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input scanner to get input
        Scanner input = new Scanner(System.in);

        //asking user to input their speed limit
        System.out.println("Enter the speed limit");
        Double limit = input.nextDouble();

        //asking user to input their speed
        System.out.println("Enter the recorded speed of the car");
        Double speed = input.nextDouble();
        Double speeding = (speed - limit);

        // if their speed was less than the limit
        while (speed <= limit) {
            //output "congratulations"
            System.out.println("Congratulations, you are within the speed limit!");
            break;
        }

        // if their speed was more than the limit
        while (speed > limit) {
            // calculate how much fast they drove past the speed limit (calculating the difference)
            double over = (speed - limit);

            if (over <= 20) {
                System.out.println("You are speeding and your fine is $100");
            }
            if (over >= 21 && over <= 30) {
                System.out.println("You are speeding and your fine is $270");
            }
            if (over >= 31) {
                System.out.println("You are speeding and your fine is $500");
            }

            break;

        }

    }
}
