package acces;

class Game{

	Game(int i){
		System.out.println("Constructor Game");
	}
	
}

class BoardGame extends Game{
	BoardGame(int i){
		super(i);
		System.out.println("Constructor BoardGame");
	}
}

public class Chess extends BoardGame{
	Chess(){
		super(11);
		System.out.println("Constructor Chess");
		
		
	}
		public static void main(String[] args){
			
			Chess chess =  new Chess();
			
		}
}