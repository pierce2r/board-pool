import java.awt.*;
import javax.swing.JFrame;

public class BallGame extends JFrame {
	
	Image ball =Toolkit.getDefaultToolkit().getImage("image/ball.png");
	Image desk =Toolkit.getDefaultToolkit().getImage("image/desk.jpg");
	double a=100;
	double b=100;
	double degree = Math.PI/3; // 60 degree 180
	
	public void paint(Graphics g) {
		System.out.println("windows is working");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball, (int)a, (int)b, null);
		
		a=a+10*Math.cos(degree);
		b=b+10*Math.sin(degree);
		
			if(b>500-40-30 || b<40+40) {
				degree = -degree;
			}
			if(a<40 || a>856-4-30) {
				degree = Math.PI - degree;
			}
	}
			
	void launchFrame() {
		setSize(865,500);
		setLocation(50,50);
		setVisible(true);
		while(true) {
			repaint();
			try {
				Thread.sleep(30); //30ms 1s = 1000ms
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	}

	public static void main(String[] args) {
		BallGame game = new BallGame();
		game.launchFrame();

	}

}
