package arcade.games.minesweeper;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Minesweeper {
	
	static CardLayout cards = new CardLayout();
	static JPanel gamePanel = new JPanel(cards);
	static JPanel remainingMineCountPanel = new JPanel(cards);
	static JPanel stopwatchPanel = new JPanel(cards);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jframe = new JFrame("Minesweeper");
		
		jframe.add(gamePanel, BorderLayout.PAGE_END);
		jframe.add(remainingMineCountPanel, BorderLayout.LINE_START);
		jframe.add(stopwatchPanel, BorderLayout.LINE_END);
		
		jframe.setResizable(false);
		jframe.setSize(800, 600);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
	}

}
