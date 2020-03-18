

public class Tree{
	int height;
	
	public Tree(){
		System.out.println("plant the mounth");
		height =0;
		}
	
	public Tree(int initializationHeigt){
		height = initializationHeigt;
		System.out.println("create new Tree " + height + " m");
		
	}
	
		void info(){
			System.out.println("Tree height " + height + " m ");
			
		}
	
		void info(String s){
			System.out.println(s + " Tree height " + height + " m" );
			
		}
	
			public static void main(String[] args){
				Tree tree1 = new Tree();
				tree1.info();
				
				Tree tree2 = new Tree(15);
				tree2.info("Birch");

		}
			
	
}