

public class Dog{
	String name;
	String says;
	
	public static void main(String[] args){
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		dog1 = dog3;
		dog1.name = "spot";
		dog1.says = "wof wof";
		dog2.name = "scruffy";
		dog2.says = "myr-myr";
		
		System.out.println(dog1.name + " " + dog1.says);
		System.out.println(dog2.name + " " + dog2.says);
		System.out.println(dog1.name == dog3.name);
		System.out.println(dog1.name == dog2.name);
		System.out.println(dog1.equals(dog2));
		System.out.println(dog1.equals(dog3));
		
	}
	
}