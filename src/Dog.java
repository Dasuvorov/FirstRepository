

public class Dog{
	String name;
	String says;
	
	void bark(String str, int i){
		System.out.println(str + " int " + i );
	}
	
	void bark(String str, byte b){
		System.out.println(str + " byte " + b );
		
	}
	
	void bark(String str, long l){
		System.out.println(str + " long " + l );
		
	}
	void bark(String str, double d){
		System.out.println(str + " double " + d );
		
	}
	
	
	public static void main(String[] args){
		Dog dog1 = new Dog();
		
		dog1.bark("wooooooo", 5);
		dog1.bark("woooowwwwww", (byte)-120);
		dog1.bark("woooo", 77777777777777777L);
		dog1.bark("woodoo people", 5.1);
	}
	
}