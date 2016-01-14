package level03;

import javax.swing.JOptionPane;

public class SpudCounter {
	public static void main(String[] args) {
		for(int t=0;t<999999999;t++){
		for(int i=1; i<8;i++){
		if (i==4){
		JOptionPane.showMessageDialog(null, "4");
		}
		else{
		JOptionPane.showMessageDialog(null, i+" potato");	
		}
		}
		JOptionPane.showMessageDialog(null, "more");
		}
}
}