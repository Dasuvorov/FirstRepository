

public class TestStackTrace{
	
	TestStackTrace(){
		devideByZero();
		
	}
	
	int devideByZero(){
		
		return 25/0;
	}
	
	
	
	public static void main(String[] args){
		
	new TestStackTrace();
		
	}
	
}