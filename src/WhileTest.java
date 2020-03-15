

public class WhileTest{
	static boolean condition(){
		boolean resault = Math.random() < 0.99;
		System.out.print(resault + ", ");
		return resault;
		
	}
	public static void main(String[] args){
		while(condition()){
			System.out.println("Inside  while");
		}
		System.out.println("Exited  while");
	}
	
	
}