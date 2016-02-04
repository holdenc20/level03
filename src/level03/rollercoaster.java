package level03;

import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
	String hight=JOptionPane.showInputDialog("What is your hight in feet?");
	int hight2 = Integer.parseInt(hight);
	if (hight2>=4){
		JOptionPane.showMessageDialog(null, "You can ride!");
	}
	else{
		JOptionPane.showMessageDialog(null, "Leave, you need to be 4 feet tall!");
	}
}
}
