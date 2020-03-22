import java.util.Arrays;
public class ExAr3{
	public static void main(String[] args){
		DemoString1[] name = new DemoString1[3];
		for(int i = 0; i< name.length; i++){
			name[i] = new DemoString1("name" + i);
		}
		
		//System.out.print(Arrays.toString(name));
		
	}
	
	
}

class DemoString1{
	DemoString1(String s){
		System.out.print(s + " ");
	}
	
}