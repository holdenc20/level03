package level03;

import javax.swing.JOptionPane;

public class VotingBoth {
public static void main(String[] args) {
	String age=JOptionPane.showInputDialog("WELCOM TO VOTING BOOTH!  "
			+ "How old are you?");
	int Age=Integer.parseInt(age);
	if(Age>17){
		String person=JOptionPane.showInputDialog("Who are you going to vote for?");
	}
	else{
		JOptionPane.showMessageDialog(null,"Try again in four years!");
	}
}
}
