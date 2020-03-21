

public class ExampleConstuctor{
	
	String s;
	int age;
	
	ExampleConstuctor(String ss, int age){
		s = ss;
		this.age = age;
			System.out.println("constructow with parameter");
	}
	
	ExampleConstuctor(){
		this("Dima", 37);
		System.out.println( "name " + s + " age " + age);
	}
	
	public static void main(String[] args){
		ExampleConstuctor ec = new ExampleConstuctor();
		
		
	}
	
}