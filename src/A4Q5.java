
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmaa1808
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input scanner to get input
        Scanner input = new Scanner(System.in);
        
       // asking the user to input their name
        System.out.println("Please enter your name:");
        
        // scanning in their name to a variable
        String name = input.nextLine();
        
        //asking user  to input their test marks and totals
        System.out.println("What was the first test out of?");
        Double total1 = input.nextDouble();
        System.out.println("What mark did you get?");
        Double mark1= input.nextDouble();
        
        System.out.println("What was the second test out of?");
        Double total2 = input.nextDouble();
        System.out.println("What mark did you get?");
        Double mark2= input.nextDouble();
        
        System.out.println("What was the third test out of?");
        Double total3 = input.nextDouble();
        System.out.println("What mark did you get?");
        Double mark3= input.nextDouble();
        
        System.out.println("What was the fourth test out of?");
        Double total4 = input.nextDouble();
        System.out.println("What mark did you get?");
        Double mark4= input.nextDouble();
        
        System.out.println("What was the fifth test out of?");
        Double total5 = input.nextDouble();
        System.out.println("What mark did you get?");
        Double mark5= input.nextDouble();
        
        // calculate the percentage of each test
        Double percentage1 = ((mark1 / total1)* 100) ;
        Double percentage2 = ((mark2 / total2)* 100) ;
        Double percentage3 = ((mark3 / total3)* 100) ;
        Double percentage4 = ((mark4 / total4)* 100) ;
        Double percentage5 = ((mark5 / total5)* 100) ;
        // output the percenatges for each test
        System.out.println("Test 1: " + percentage1+ "%");
        System.out.println("Test 2: " + percentage2+ "%");
        System.out.println("Test 3: " + percentage3+ "%");
        System.out.println("Test 4: " + percentage4+ "%");
        System.out.println("Test 5: " + percentage5+ "%");
      
        // calculate average
        Double average = ((percentage1 + percentage2 + percentage3 + percentage4 + percentage5)/5);
         
        // output total average
        System.out.println("Average:" + average + "%");
        
        
        
        
        
        
        
                }
}
