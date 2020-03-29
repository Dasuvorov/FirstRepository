
		class Art{
			Art(){
				System.out.println("constructor ART");
			}
			
		}
		class Drawing extends Art{
			Drawing(){
				System.out.println("constructor Drawing");
			}
			
		}
		



public class Cartoon extends Drawing{
		Cartoon(){
			System.out.println("constructor Cartoon");
		}
public static void main(String[] args){
	
	Cartoon c = new Cartoon();
}


}