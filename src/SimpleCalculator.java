

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SimpleCalculator {
	public static void main(String[] args) {
	
		// 1. Get 2 numbers from the user and convert them to integer.
		
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	
	for (int i = 0; i <4; i++) {
		String num1=JOptionPane.showInputDialog("Pick a number");
		String num2=JOptionPane.showInputDialog("Pick another number");
		int Num1 = Integer.parseInt(num1);
		int Num2 = Integer.parseInt(num2);
		int operation = JOptionPane.showOptionDialog(null, "What expression do you wanna use", "Expressions", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] {  "Addition","Division", "Subtraction", "Multiply" },
				null);
		if(operation ==0) {
			add( Num1, Num2);
		}
		if(operation ==1) {
			divide( Num1, Num2);
		}
		if(operation ==2) {
			subtract( Num1, Num2);
		}
		if(operation ==3) {
			multiply( Num1, Num2);
		}

		
	}
	}
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int Num1, int Num2){
		System.out.println(Num1+Num2);
	}
	static void divide(int Num1, int Num2){
		System.out.println(Num1/Num2);
	}
	static void subtract(int Num1, int Num2){
		System.out.println(Num1-Num2);
	}
	static void multiply(int Num1, int Num2){
		System.out.println(Num1*Num2);
	}

	// 4. Create similar methods for subtraction, multiplication and division.
}
