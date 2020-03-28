

 class Connection{

	 private Connection(){
		;
	 }
	static Connection getMyConnection(Integer number){
			System.out.println("create connection  " + number);
		
		return new Connection();
	}
 }



public class ConnectionManager{
	public static void main(String[] args){

		Connection[] connection =  new Connection[5];

			for(int i = 0; i< 10; i++){
				if(i < 5){
				connection[i] = Connection.getMyConnection(i);
					}else{
						Connection conn = Connection.getMyConnection(null);
				
					
				}
			}


	}


}