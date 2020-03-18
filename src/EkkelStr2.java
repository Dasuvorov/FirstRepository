

//Класс с полем стринг инициализация в точке определения

public class EkkelStr2{
	String str;
	public EkkelStr2(String string){
		str = string;
		System.out.println(str);
	}
	
	public static void main(String[] args){
		
		new EkkelStr2("Mother washed the frame");
		
	}
	
}