package GameFlappyBird;

public class Score {
	private static int score=0;
	private Bird birdS = new Bird();
	private WaterPipe waterpipeS = new WaterPipe();
	public static int getScore(){
		return score;
	}
	private static boolean b1=false, b2=false, b3=false, b4=false;
	public void scoreup(){
		if(birdS.getX()+45> waterpipeS.getX1()&& birdS.getX()<waterpipeS.getX1()+65){
			b1=true;

		}
		if(b1== true && birdS.getX()>waterpipeS.getX1()+65){
			score++;
			b1= false;
		}
		if(birdS.getX()+45> waterpipeS.getX2()&& birdS.getX()<waterpipeS.getX2()+65){
			b2=true;

		}
		if(b2== true && birdS.getX()>waterpipeS.getX2()+65){
			score++;
			b2= false;
		}
		if(birdS.getX()+45> waterpipeS.getX3()&& birdS.getX()<waterpipeS.getX3()+65){
			b3=true;

		}
		if(b3== true && birdS.getX()>waterpipeS.getX3()+65){
			score++;
			b3= false;
		}
		if(birdS.getX()+45> waterpipeS.getX3()&& birdS.getX()<waterpipeS.getX3()+65){
			b3=true;

		}
		if(b3== true && birdS.getX()>waterpipeS.getX3()+65){
			score++;
			b3= false;
		}
	}




}
