//переписать класс IfElseEkkel  так чтобы число testva1 
// попадало в диапазон begin  и  end;
public class IfElseEkkel2{
		static int resault =0;
	static int test(int begin, int end,  int testva1){
			int min;
			int max;
			if(begin> end){
				max = begin;
				min = end;
			}else{
				min = begin;
				max = end;
				
			}
			if(testva1 >= min && testva1 <= max){
				return 1;
			}else {
				return -1;
			}
		}
	
		public static void main(String[] args){
			
			System.out.println(test(10,5, 3));
			
			System.out.println(test(5,10,5));
			test(5,5,0);
			System.out.println(test(5,5,0));
				
		
	}
	
}