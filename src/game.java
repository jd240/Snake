import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class game implements KeyListener  {

	private player snake;
	private food apple;
	private JFrame window; 
	private display graphic;
	public static final int w = 600;
	public static final int h = 600;
	public static final int block = 20;
	public game(){
		this.window = new JFrame();
		this.window.setTitle("Snake");
		this.window.setSize(w, h);
		this.window.setVisible(true);
		this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close by x button
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int input = e.getKeyCode();
		switch(input) {
		  case KeyEvent.VK_W:
			snake.setDirection("UP");
		    break;
		  case KeyEvent.VK_S:
			snake.setDirection("DOWN");
		    break;
		  case KeyEvent.VK_A:
		    snake.setDirection("LEFT");
		    break;  
		  default:
			snake.setDirection("RIGHT");
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public player getSnake() {
		return snake;
	}
	public void setSnake(player snake) {
		this.snake = snake;
	}
	public food getApple() {
		return apple;
	}
	public void setApple(food apple) {
		this.apple = apple;
	}
	public JFrame getWindow() {
		return window;
	}
	public void setWindow(JFrame window) {
		this.window = window;
	}
	
}
