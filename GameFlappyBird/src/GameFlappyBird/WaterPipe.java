package GameFlappyBird;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class WaterPipe extends JPanel{
	private static int x1= 500, x2=x1+150, x3=x2+150, x4=x3+150;
	private static int h1,h2,h3,h4;
	private static boolean b1=false;
	private static boolean b2=false;
	private static boolean b3=false;
	private static boolean b4=false;
	private BufferedImage waterpipeup, waterpipedown;
	public static int getH1(){
		return h1;
	}
	public static int getH2(){
		return h2;
	}
	public static int getH3(){
		return h3;
	}
	public static int getH4(){
		return h4;
	}public static int getX1(){
		return x1;
	}
	public static int getX2(){
		return x2;
	}
	public static int getX3(){
		return x3;
	}
	public static int getX4(){
		return x4;
	}
	public void randomH(){
	Random rd= new Random();
	if(b1==false){
	h1=rd.nextInt(200);
	b1=true;}
	if(b2==false){
	h2=rd.nextInt(200);
	b2=true;}
	if(b3==false){
	h3=rd.nextInt(200);
	b3=true;}
	if(b4==false){
	h4=rd.nextInt(200);
	b4=true;}
	}
	public void paint(Graphics g){
		randomH();
		try {
			waterpipeup=ImageIO.read(new File("C://Users//Miki//Desktop//flappybird//waterpipeup.png"));
			waterpipedown=ImageIO.read(new File("C://Users//Miki//Desktop//flappybird//waterpipedown.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g.drawImage(waterpipeup , x1 , 0 , 50 , h1 , null);

		g.drawImage(waterpipedown, x1, h1+150, 50, 400 , null);
		g.drawImage(waterpipeup , x2, 0 , 50 , h2 , null);

		g.drawImage(waterpipedown, x2, h2+150, 50, 400 , null);

		g.drawImage(waterpipeup , x3, 0 , 50 , h3 , null );

		g.drawImage(waterpipedown, x3, h3+150, 50, 400 , null);

		g.drawImage(waterpipeup , x4 , 0 , 50 , h4  , null);

		g.drawImage(waterpipedown, x4, h4+150, 50, 400 , null);


		/*//waterpipe1ng
		g.setColor(Color.black);
		g.fillRect(x1, 0, 50, h1);
		g.setColor(Color.gray);
		g.fillRect(x1, h1+150, 50, 400);
		//waterpipe2
		g.setColor(Color.blue);
		g.fillRect(x2, 0,50, h2);
		g.setColor(Color.red);
		g.fillRect(x2, h2+150, 50, 400);
		//waterpipe3
		g.setColor(Color.pink);
		g.fillRect(x3, 0, 50, h3);
		g.setColor(Color.darkGray);
		g.fillRect(x3, h3+150,50,400);
		//waterpipe3
		g.setColor(Color.cyan);
		g.fillRect(x4, 0, 50, h4);
		g.fillRect(x4, h4+150, 50, 400);*/



	}
	public void downX(){
		//x=x-1;
		x1--;
		x2--;
		x3--;
		x4--;
	}
	public void returnX(){
		if(x1==-65){
			x1=500;
			b1=false;
		}
		if(x2==-65){
			x2=500;
			b2=false;
		}
		if(x3==-65){
			x3=500;
			b3=false;
		}
		if(x4==-65){
			x4=500;
			b4=false;
		}


	}

}
