package GameFlappyBird;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Paint extends JPanel implements Runnable{
	private Bird birdP= new Bird();
	private WaterPipe waterpipeP= new WaterPipe();
	private Test testP= new Test();
	private Thread threadP;
	private Score scoreP= new Score();
	private BufferedImage bg, floor;

	public Paint(){
		Thread threadP= new Thread(this);
		threadP.start();
	}
	public void paint(Graphics g){
		try {
				/*g.setColor(Color.cyan);
				g.fillRect(0, 0,getWidth(), getHeight());*/
			bg=ImageIO.read(new File("C://Users//Miki//Desktop//flappybird//BG.png"));
			g.drawImage(bg,0,0,null );
			waterpipeP.paint(g);
					/*g.setColor(Color.green);
					g.fillRect(0, 400,getWidth(), getHeight());
					g.setColor(Color.orange);
					g.fillRect(0, 410, getWidth(), getHeight());*/
			floor=ImageIO.read(new File("C://Users//Miki//Desktop//flappybird//floor.png"));
			g.drawImage(floor,0,400,null);
			birdP.paint(g);

			g.setColor(Color.white);
			g.setFont(new Font("Arial", Font.BOLD, 20));
			g.drawString("Score:"+ scoreP.getScore(), 10, 20);



		} catch (IOException e) {

			e.printStackTrace();
		}

}
	public void run() {
		while(true){
			repaint();
			waterpipeP.downX();
			try {
				Thread.sleep(13);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}waterpipeP.returnX();
			birdP.upY();
			if(testP.die()==true){
				threadP.stop();
			}
			scoreP.scoreup();

		}
	}

}
