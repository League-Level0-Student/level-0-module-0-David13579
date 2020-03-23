package _07_last_summer;

import javax.swing.JOptionPane;

public class Last_Summer {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What's your name?");
		String activity = JOptionPane.showInputDialog("What did you do last summer?");
		JOptionPane.showMessageDialog(null,"I know you "+activity+" last summer, "+name+". Muhahaha!");
	}
}
