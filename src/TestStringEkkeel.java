
public class TestStringEkkeel{
	static void stringOp(String str1, String str2){

        System.out.println( str1 + str2);
        System.out.println(str1.length());
        System.out.println(str1.equals(str2));
        System.out.println(!str1.equals(str2));
        String str3 = str1 + str2;
        System.out.println(str3);
        System.out.println(str3.replace('H','Z'));
        System.out.println(str2.compareTo(str1));
		
	}
	public static void main(String[] args){
		
		stringOp("Hello world ", "Hello Java ");
		
	}
	
}