
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmaa1808
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // scanner to get user input
        Scanner input = new Scanner(System.in);
        
        //asking the user to input their name
        System.out.println ("Please enter your name");
        
        // scanning in their name into a variable 
        String name = input.nextLine();
        
        //saying "hello" to the user
        System.out.println("Hello " + name + ". How are you today?");
        
        
        
        
    }
}
