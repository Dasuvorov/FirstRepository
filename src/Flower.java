

public class Flower{
	
	int petalCount =0;
	String s  = "inital value";
	
	Flower(int petals){
		petalCount = petals;
		System.out.println("Constuktor with parameter int petalCount " + petalCount);
		}
	
	Flower(String ss){
		System.out.println("Constructor with parameter string s = " + ss);
		s =ss;
	}
	
	Flower(String s, int petals){
		this(petals);
		this.s = s;
		System.out.println("Arguments string  and int");
		
	}
	
	Flower(){
		this("Hi", 47);
		System.out.println("constructor without arguments");
		
	}
	
	void printPetalCount(){
		System.out.println("petalCount " + petalCount + " s= " + s);
	}
	public static void main(String[] args){
		Flower x = new Flower();
		x.printPetalCount();
	}
	
}