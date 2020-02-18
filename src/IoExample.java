import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 studu used io Example

*/

public class IoExample{
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		
		try{
		File file = new File("D:\\P1\\src\\newfile222.txt");
			if(!file.exists()){
		file.createNewFile();
			}
			PrintWriter pw = new PrintWriter(file);
			pw.println("Everything is  working");
			pw.println("Hello Java");
			pw.println("Hello Java My name is Dima is Last name Is Suvorov");
			pw.close();
			
			br = new BufferedReader(new FileReader("D:\\P1\\src\\newfile111.txt")); 
			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
				
			}
		}catch(IOException e){
			System.out.print("Error " + e);
		}finally {
			br.close();
		}
	}
	
}