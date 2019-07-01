package GameFlappyBird;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Bird extends JPanel{
	private static int y=200;
	private static int x=100;
	private BufferedImage bird;
	public int getY(){
		return y;
	}
	public int getX(){
		return x;
	}

	public void paint(Graphics g){
		/*g.setColor(Color.red);
		g.fillRect(x, y, 10, 15);

*/
		try {
			bird=ImageIO.read(new File("C://Users//Miki//Desktop//flappybird//Bird.png"));
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
			g.drawImage(bird,x,y,null);
	}
	// bird go up
	public void upY(){
		y++;

	}
	// bird go down
	public void downY(){
		y= y-50   ;

	}

}
