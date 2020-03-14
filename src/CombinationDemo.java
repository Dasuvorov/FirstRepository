

class Combo{
	float f = 123.12f;
}

public class CombinationDemo{
	public static void comboMethod(Combo m){
		m.f += 10;
		
	}
		public static void main(String[] args){
			Combo combo = new Combo();
			combo.f = 100.123f;
			SysDim.print("1: combo.f " + combo.f);
			comboMethod(combo);
			SysDim.print("2: combo.f " + combo.f);
		
		}
		
		
	}
	
	
