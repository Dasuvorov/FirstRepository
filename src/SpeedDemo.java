import java.util.Random;

//написать программу для растчета скорости для 
//постоянных значение.

public class SpeedDemo{
	public static void main(String[] args){
		
		Random random = new Random(147);
		double distance;
		double time;
	//	double speed;
		distance = random.nextDouble()+800;
		System.out.println("distance " + distance);
		time =  random.nextDouble() +8;
			System.out.println("time " + time);
		 double speed = distance/time;
			System.out.println("speed " + speed);
		
	}
	
}