package level03;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {
	/*
	 * Ask the user how many hours they spent coding this week.
	 * 
	 * 1. If it's more than 3, tell them they're a Code Ninja.
	 * 
	 * 2. If it's less than 2, tell them to stop watching YouTube and write code instead.
	 * 
	 * 3. If it's more than 5, play the Batman theme song.
	 */
	String x=JOptionPane.showInputDialog(null,"How many hour have you coded this week?");
	int y=Integer.parseInt(x);
	if (y>5){
		playBatmanTheme();
	}
	else if (y>3){
	System.out.println("You are a Code Ninja");	
	}
	else if(y>1 & y<4){
	System.out.println("nice coding!");	
	}
	else if(y<2){
		System.out.println("stop watching YouTube and write code instead");
	}
	else{
		System.out.println("Errrror");
	}
	}


	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}}