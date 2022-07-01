import java.util.Scanner;

/**
 * A simple java program that prompts the user to input
 * and stores that input
 * NOTE: this is one of the crappiest documentation
 */

public class GetInputFromUser {
    public static void main(String[]args){

        // create a scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value $");
        String inputValue = input.nextLine();

        System.out.println("You entered a string =>" +
                "" +
                ""+inputValue);
        System.out.println("Experimental ASCII programs");
        System.out.println("<<<------------------------------>>>");
        for( int i = 0; i <= 20; i++){
            System.out.println((char)i);
        }
    }
}
