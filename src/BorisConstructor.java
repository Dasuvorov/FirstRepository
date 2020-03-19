

public class BorisConstructor{
	
	BorisConstructor(){
		System.out.println("Message");
		}
	BorisConstructor(String str){
		
		System.out.println(str + "Message");
	}
	
	
	public static void main(String[] args){
		BorisConstructor bc = new BorisConstructor();
		BorisConstructor bc2 = new BorisConstructor("Overloaded string ");
	}
	
}