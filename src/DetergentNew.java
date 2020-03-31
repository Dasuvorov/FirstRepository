


public class DetergentNew{
	
	private String name;
	Cleanser cleanser = new Cleanser();
	public  DetergentNew(String name){
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public void dilute() {
		cleanser.dilute(" dilute()");
	}

	public void apply() {
		cleanser.append(" apply()");
	}

	public void scrub() {
		cleanser.scrub(" scrub()");
	}


	public static void main(String[] args) {
		Detergent dt = new Detergent("Name");
		dt.dilute("Vasia");
	}
}