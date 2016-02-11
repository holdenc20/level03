// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
		
		boolean isWeekday, isVacation;
		
		int x =JOptionPane.showConfirmDialog(null, "is it a weekday?","",
		JOptionPane.YES_NO_OPTION);
		if(x==1){
		JOptionPane.showMessageDialog(null, "sleep in");
		}
		if(x==0){
			int c =JOptionPane.showConfirmDialog(null, "is it a vacation?","",
					JOptionPane.YES_NO_OPTION);
					if(c==0){
					JOptionPane.showMessageDialog(null, "sleep in");
					}
					if(c==1){
					JOptionPane.showMessageDialog(null, "get up lazybones!");
					}
		
		}
		/*
		 * Ask the user for these values using
		
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
		
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
}
