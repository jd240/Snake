import java.awt.Rectangle;

public class food {
	private int x;
	private int y;
	public food(player snake) {
		this.randomSpawn(snake);
	}
	public void randomSpawn(player snake){
		boolean onSnake = false;
		int length = snake.getBody().size();
		while(!onSnake){
			x = (int) (Math.random() * game.w);
			y = (int) (Math.random() * game.h);
			for (int i = 0; i < length; i++) {
				Rectangle r = snake.getBody().get(i); 
				if(r.x == x && r.y == y) {
					onSnake = true;
				}
			}
		}
	}
}
