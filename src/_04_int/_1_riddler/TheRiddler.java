package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int playerScore = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String q = JOptionPane.showInputDialog("The answer is yes");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (q.equals ("yes"))
{
	playerScore += 1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else 
{
JOptionPane.showMessageDialog(null, "The answer is yes.");	
}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, playerScore);
	}
}

	