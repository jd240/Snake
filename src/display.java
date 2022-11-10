import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import javax.swing.*;
public class display extends JPanel implements ActionListener {
	private Timer time = new Timer(75, this);
	private player snake;
	private food apple;
	private game game;
	private String state;
	public display(game start) {
		time.start();
		state = "Start";
		this.game = start;
		this.snake = game.getSnake();
		this.apple = game.getApple();
		this.addKeyListener(start);
		this.setFocusable(true);
		this.setFocusTraversalKeysEnabled(false);
	}
	
	public void paintComponent(Graphics d) {
		super.paintComponent(d);
		Graphics2D g = (Graphics2D) d;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		
	}

}
