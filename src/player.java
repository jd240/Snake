import java.util.*;
import java.awt.*;
public class player {
	private ArrayList<Rectangle> body;
	private String currentDirection;
	public player() {
		body = new ArrayList();
		Rectangle rec = new Rectangle(game.block, game.block);
		rec.setLocation(game.w / 2, game.h / 2); // set starting location
		body.add(rec);
		currentDirection = "Empty";
	}

	public void setDirection (String direction) {
		this.currentDirection = direction;
	}
	public ArrayList<Rectangle> getBody() {
		return body;
	}

	public void setBody(ArrayList<Rectangle> body) {
		this.body = body;
	}
	
}
