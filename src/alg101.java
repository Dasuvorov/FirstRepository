

public class alg101{
	public static  int gcd(int p, int q){ 
	 if(q == 0) return p;
	 int r = p%q;
	 return gcd(q,r);
	}
	public static void main(String[] args){
		System.out.print(gcd(5,10));
		
	}
}