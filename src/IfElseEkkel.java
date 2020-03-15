
public class IfElseEkkel{
		static int resault =0;
	static void test(int testva1, int target){
		if(testva1 > target){
			resault = +1;
		}else if(testva1 < target){
			resault = -1;
		}else {
			resault = 0;
		}
	}
		public static void main(String[] args){
			test(10,5);
			System.out.println(resault);
			test(5,10);
			System.out.println(resault);
			test(5,5);
			System.out.println(resault);
				
		
	}
	
}