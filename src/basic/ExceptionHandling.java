// Basic example of an errorHandling with a try-catch block.
// This example handles all errors in the try block, which means we don't
// know exactly what caused the error. 



package basic;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		boolean runs = false;
		
		// DW-loop to make the code iterate until the error is handled

		do {
		
		// The actual code we're testing for errors
			try {
				System.out.println("Enter first number: ");
				int n1 = keyboardInput.nextInt();
				System.out.println("Enter second number: ");
				int n2 = keyboardInput.nextInt();
				int devide = n1 / n2;
				System.out.println("----------------------" + "\n" +
						n1 + " / " + n2 + " = " + devide + "\n" +
						"----------------------" + "\n" +
						"ANSWER IS: " + devide + "\n" +
						"----------------------" + "\n" +
						"Hit run to try again:" + "\n" +
						"<Ctrl+F11> or <Ctrl+r>" + "\n" +
						"----------------------" + "\n"
						);
				runs = true;

			} 
			
		// If any type of error occurs this message will be printed
			catch (Exception e) {
				System.out.println("You did something wrong, please try again: " + "\n");
			}
		} while (!runs);

	}

}
