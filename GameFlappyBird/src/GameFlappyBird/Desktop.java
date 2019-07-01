package GameFlappyBird;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Desktop extends JFrame{
	private Paint paintM= new Paint();
	private Bird birdM= new Bird();
	public Desktop(){
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(400,100);
		add(paintM);
		setResizable(false);
		addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent ke){

				birdM.downY();
			}

		});
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
				birdM.downY();

			}

		});


	}
	public static void main(String[] args){
		Desktop m= new Desktop();
	}

}
