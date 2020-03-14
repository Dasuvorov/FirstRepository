

class Letter{
	char c;
}

public class PassObject{
	static void f(Letter y){
	y.c = 'z';
}
	public static void main(String[] args){
		Letter x = new Letter();
		x.c = 'a';
		SysDim.print("1: x.c " + x.c);
		f(x);
		SysDim.print("1: x.c " + x.c);
		
	}
	
}

