

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String num1=JOptionPane.showInputDialog("Pick a number");
		String num2=JOptionPane.showInputDialog("Pick another number");
		int Num1 = Integer.parseInt(num1);
		int Num2 = Integer.parseInt(num2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What expression do you wanna use", "Expressions", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Division", "Addition", "Subtraction", "Multiply" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int Num1, int Num2){
	System.out.println(Num1+Num2);
}
	// 4. Create similar methods for subtraction, multiplication and division.
}