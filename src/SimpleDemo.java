


		class Simple{
	
			Simple(){
				System.out.println("Constructor Simle");
		}
	}
		
		public class SimpleDemo{
			Simple simple;
			
		public String toString(){
			simple = new Simple();
			return "simple " + simple + "\n";
			
		}	
		
			public static void main(String[] args){
				SimpleDemo sd = new SimpleDemo();
				System.out.println(sd);
				
				
			}
		}