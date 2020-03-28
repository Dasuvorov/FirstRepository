import acces.local.PackagedClass;

	class WaterSource{
		private String s;
		WaterSource(){
			PackagedClass.println("WaterSource*() ");
			s = "designed";
			
		}
		public String toString(){
			return s;
		}
		
	}

public class SprinklerSystem{
		private	String value1, value2, value3, value4;
		private int i;
		private float f;
		private	WaterSource source = new WaterSource();
	
		public String toString(){
			return 
			"value1 " + value1 + " " +
			"value2 " + value2 + " " +
			"value3 " + value3 + " " +
			"value4 " + value4 + " " +
			"i " + i + " " +
			"f " + f + " " +
			"source " + source + " ";
		}

		public static void main(String[] args){
			SprinklerSystem sprink = new SprinklerSystem();
			PackagedClass.println(sprink.toString());
			
			
		}


}