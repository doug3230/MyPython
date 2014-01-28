package card;

import javax.swing.*;

public class Test {

	public static void main(String[] args) {
		JFrame window = new JFrame("Test Window");
		
		Card ace = new Card(1,"spades");
		CardSprite aceSprite = new CardSprite(ace, "standard_deck", true);
		aceSprite.setSize(200,160);
		aceSprite.updateIconSize();
		aceSprite.setSize(1,1);
		aceSprite.updateIconSize();
		
		window.setSize(400,400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(aceSprite);
		window.setVisible(true);
	}

}
