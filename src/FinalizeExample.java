

public class FinalizeExample {
	@Override
	protected void finalize(){
		System.out.println("Method finalize");
	}
	
	
	public static void main(String[] args){
		FinalizeExample fe = new FinalizeExample();
		fe.finalize();
		
	}
	
}