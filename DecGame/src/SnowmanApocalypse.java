import java.awt.Dimension;
import javax.swing.JFrame;

public class SnowmanApocalypse {

	JFrame frame;
	final static int WIDTH = 800;
	final static int HEIGHT = 500;
	GamePanel gamepanel;

	public static void main(String[] args) {
		SnowmanApocalypse snowmanapocalypse = new SnowmanApocalypse();

			snowmanapocalypse.setup();

		}

	public SnowmanApocalypse() {
			frame = new JFrame();
			gamepanel = new GamePanel();
		}

	void setup() {
		frame.add(gamepanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane();
		frame.setPreferredSize(new Dimension(800, 500));
		frame.pack();

		gamepanel.startGame();
		frame.addKeyListener(gamepanel);

		frame.setTitle("SNOWMAN APOCALYPSE");

	}

}
