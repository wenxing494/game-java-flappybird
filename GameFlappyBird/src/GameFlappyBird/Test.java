package GameFlappyBird;

public class Test {
	private Bird birdT= new Bird();
	private WaterPipe waterpipeT= new WaterPipe();
	public boolean die(){
		if(birdT.getY()+ 45 >=420){
			return true;
		}
		if (birdT.getY()<=waterpipeT.getH1()&&(((birdT.getX()+10)>=waterpipeT.getX1()))&& birdT.getX()<=(waterpipeT.getX1()+10)){
			return true;
		}
		if((birdT.getY()+10>=waterpipeT.getH1()+150)&&((birdT.getX()+10)>=waterpipeT.getX1()&&birdT.getX()<=(waterpipeT.getX1()+10))){
			return true;
		}
		if (birdT.getY()<=waterpipeT.getH2()&&(((birdT.getX()+10)>=waterpipeT.getX2()))&& birdT.getX()<=(waterpipeT.getX2()+10)){
			return true;
		}
		if((birdT.getY()+10>=waterpipeT.getH2()+150)&&((birdT.getX()+10)>=waterpipeT.getX2()&&birdT.getX()<=(waterpipeT.getX2()+10))){
			return true;
		}
		if (birdT.getY()<=waterpipeT.getH3()&&(((birdT.getX()+10)>=waterpipeT.getX3()))&& birdT.getX()<=(waterpipeT.getX3()+10)){
			return true;
		}
		if((birdT.getY()+10>=waterpipeT.getH3()+150)&&((birdT.getX()+10)>=waterpipeT.getX3()&&birdT.getX()<=(waterpipeT.getX3()+10))){
			return true;
		}
		if (birdT.getY()<=waterpipeT.getH4()&&(((birdT.getX()+10)>=waterpipeT.getX4()))&& birdT.getX()<=(waterpipeT.getX4()+10)){
			return true;
		}
		if((birdT.getY()+10>=waterpipeT.getH4()+150)&&((birdT.getX()+10)>=waterpipeT.getX4()&&birdT.getX()<=(waterpipeT.getX4()+10))){
			return true;
		}

		return false;
	}

}
