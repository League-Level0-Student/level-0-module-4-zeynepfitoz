//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels= JOptionPane.showInputDialog("How many nickels do you have");
		// Convert their answer to an int using Integer.parseInt()
int Nickels = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes= JOptionPane.showInputDialog("How many dimes do you have");
		// Ask the user how many quarters they have, and convert their answer
int Dimes = Integer.parseInt(dimes);
String Quarters= JOptionPane.showInputDialog("How many quaters do you have");
int quarters = Integer.parseInt(Quarters);
		// Calculate how much money the user has and save it in a double variable 
double money = 0.0;
money+= Nickels*.05;
money+= Dimes*.10;
money+= quarters*.25;
System.out.println("You have $"+money);
		// Tell the user how much money they have

	}
}

