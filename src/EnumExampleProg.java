

     enum EnumExample{
	 SLOW, MIDDLE, QUICK


}

public class EnumExampleProg{
	public static void main(String[] args){
		EnumExample ee = EnumExample.MIDDLE;
		System.out.println(ee);
		for(EnumExample e : EnumExample.values()){
			System.out.println(e + " number enum " + e.ordinal());
			
		}

	}

}


