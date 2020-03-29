

class Aa{
	Aa(int i){
		
		System.out.println("Aa");
	}
	
}

class Bb {
		Bb(int i){
					
			System.out.println("Bb");
		}
	
}

public class Cc extends Aa{
	Cc (){
		super(21);
	Bb b = new Bb(21);
	Cc c = new Cc();
	}
	
	public static void main(String[] args){
		Cc c = new Cc();
	}
}
