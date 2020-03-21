

public class Tank{
	boolean chek = false;
	Tank(boolean chek){
		this.chek = chek;

	}	
		
		void chekIn(){
		chek = false;
		}
		public void finalize(){
			if(chek){
				System.out.println("Chack is empty"  );
			}
		}
	
	public static void main(String[] args){
		Tank tank = new Tank(true);
		tank.chekIn();
		
		System.gc();
	}
	
}