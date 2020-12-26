import java.awt.Color;
import java.awt.Graphics;

public class MainCharacter extends GameObject{
	int speed;
	
	MainCharacter(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
		// TODO Auto-generated constructor stub
	}
	
	void update() {
		
	}
	
	void draw(Graphics g) {
		g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
	}
	
	void up() {
		y-=speed;
	}
	void down() {
		y+=speed;
	}
	void left() {
		x-=speed;
	}
	void right() {
		x+=speed;
	}
}
