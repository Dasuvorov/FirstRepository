

   class Cleanser{
	private String s = "Cleanser";
	public void append(String a){
		s+=a;
	}
	public void dilute(String s){}
	public void apply(String s){}
   	public void  scrub(String s){}
	

   
   }
   
   public class Detergent extends  Cleanser {
	   String name;

	   public Detergent(String name) {
		   this.name = name;
	   }

	   public static void main(String[] args) {
		   Detergent d = new Detergent("Name");
		   d.dilute("Vasia");
	   }

   }