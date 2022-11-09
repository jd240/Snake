import javax.swing.JFrame;

public class game {

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
}
