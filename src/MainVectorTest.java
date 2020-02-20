
public class MainVectorTest{
	public static void main(String[] args){
		VectorTest vt1 = new VectorTest(0, 3,4);
		System.out.println(vt1.sqrtVector() + " option1");
		
		//overload
		VectorTest vt2 = new VectorTest();
		System.out.println(vt2.sqrtVector() + " option2 ");
		
		System.out.println(vt1.scalarVector() + " option1");
		
	}
}