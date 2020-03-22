import java.util.Arrays;
public class ExAr2{
	public static void main(String[] args){
		DemoString[] name = new DemoString[3];
		
		System.out.print(Arrays.toString(name));
		
	}
	
	
}

class DemoString{
	DemoString(String s){
		System.out.print(s + " ");
	}
	
}