import java.awt.Color;
import java.awt.Graphics;

public class Snowman extends GameObject {
	int speed;
	
	Snowman(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 1;
		// TODO Auto-generated constructor stub
	}
	
	void update() {
		if(x<10) {
			x+=speed;
		}
		if(x>790) {
			x-=speed;
		}
	}
	
	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);
	}
}
