import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 200000; i++) {

			int task = JOptionPane.showOptionDialog(null, "What do you want do to make your pet happy", pet, 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Give food", "Groom and clean", "Clean up poop" }, null);

			if (task == 0) {
				feed();
			}
			if (task == 1) {
				groom();
			}
			if (task == 2) {
				clean();
			}
			if (happinessLevel > 89) {
				JOptionPane.showMessageDialog(null, "Your pet is now too happy it died");
				break;
			}
		}
	}

	static void feed() {
		happinessLevel += 20;
		String food = JOptionPane.showInputDialog("Yay your pet is full");

	}

	static void groom() {
		happinessLevel += 15;
		String clean = JOptionPane.showInputDialog("Your pet is now clean and feeling good");
	}

	static void clean() {
		happinessLevel += 15;
		String poop = JOptionPane.showInputDialog("Your pet's area is now clean");
		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.

		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

	}
}

// 4. Create methods to handle each of your user selections.
// Each method should create a pop-up with the pet's response (eg. cat might
// purr when pet),
// and INCREMENT the pet's happiness Level.
