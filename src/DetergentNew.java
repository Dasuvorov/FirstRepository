


public class DetergentNew extends Detergent{
	
	public void scrub(){
		append(" DetergentNew.scrub()");
	}

	public void sterilize(){
		
		append(" sterilize()");
		
	}

		public static void main(String[] args){
			
			DetergentNew dn = new DetergentNew();
			dn.scrub();
			dn.sterilize();
			System.out.println(dn);
			System.out.println("checked based class Detergent");
			
			Detergent.main(args);
			
		}

}