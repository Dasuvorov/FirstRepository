
public class TestLong{
public static void main(String[] args){

		long b = 077777777777L; 
		long d = 0xffffffffffL;
	System.out.println(Long.toBinaryString(b));
	System.out.println(Long.toBinaryString(d));

	float minF = 1.4e-45f; 
	float maxF =  3.4e+38f;
	double minD = 4.9e-324 ;
	double maxD = 1.7e+308;
	System.out.println(minF + " " + maxF);
	System.out.println(minD + " " + maxD);
}

}