import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFile{
	public static void main(String[] args){
		String str = "C:\\temp\\00002.vcf1";
		FileReader afile = null;
		BufferedReader buff = null;

		try{
			afile = new FileReader(str);
			buff = new BufferedReader(afile);

			while(true){
				String line = buff.readLine();

				if(line ==  null){
					break;}

				System.out.println(line);
			}

		}catch (IOException e){
			JOptionPane.showMessageDialog(null,"Произошла лупнина", "ERROR", JOptionPane.ERROR_MESSAGE);

		}finally {
			try{
				buff.close();
				afile.close();
			}catch (IOException e1){
				e1.printStackTrace();
			}
		}





	}
}