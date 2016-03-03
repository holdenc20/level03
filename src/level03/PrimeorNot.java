package level03;

import javax.swing.JOptionPane;

public class PrimeorNot {
	public static void main(String[] args) {
		String Number = JOptionPane.showInputDialog("Chose a number");
		int number = Integer.parseInt(Number);
		boolean p = false;
		if(number==0){
			JOptionPane.showMessageDialog(null,"0 is not prime or prime it is other!");
		}
		else{
		for (int x = 2; x < number-1; x++) {
			if (number % x == 0) {
				p = true;

			}
		}

		if (p == false) {
			JOptionPane.showMessageDialog(null, "Your number is Prime");
		} else {
			JOptionPane.showMessageDialog(null, "Your number is not Prime!");
		}
	}
}
}