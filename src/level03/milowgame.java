package level03;
import java.util.Random;

import javax.swing.JOptionPane;
public class milowgame {
// Copyright Wintriss Technical Schools 2013

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		Random r=new Random();
		int x =r.nextInt(100);
		// 2. Print out the random variable above
		//got rid of
		// 11. do the following 10 times
		int q=11;
		while (q>1){
			q=q-1;
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
			String guess=JOptionPane.showInputDialog("Chose a number"); 
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int number=Integer.parseInt(guess);
			// 5. if the guess is correct
			if (number==x){
				JOptionPane.showMessageDialog(null, "YOU WIN!!!");
				q=q-10;
			}
				// 6. win
			// 7. if the guess is high
			if(number<x){
				JOptionPane.showMessageDialog(null, "Too low!");
			}
				// 8. tell them it's too high
			// 9. if the guess is low
			if(number>x){
				JOptionPane.showMessageDialog(null, "Too high!");
			}
			int p=q-1;
			JOptionPane.showMessageDialog(null, p+" more guesses!");
				// 10. tell them it's too low

		// 12. tell them they lose
			if (p==0){
				JOptionPane.showMessageDialog(null, "You Lose!");
				JOptionPane.showMessageDialog(null, "The real number was"+x);
			}
		}
		
		JOptionPane.showMessageDialog(null, "You Lose!");
		JOptionPane.showMessageDialog(null, "The real number was"+x);
			

	}}



