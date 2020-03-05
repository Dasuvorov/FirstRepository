import java.awt.*;
import javax.swing.*;


public class FileCopy{
	
	JPanel windowsContent;
	JLabel labelFrom;
	JLabel labelTo;
	JTextField textFrom;
	JTextField textTo;
	JButton buttonFrom;
	JButton buttonTo;
	JButton buttonCopy;
	JPanel p1;
	JPanel p2;
	
	
	FileCopy(){
		windowsContent = new JPanel();
		BorderLayout bl = new BorderLayout();
		windowsContent.setLayout(bl);
		p1 = new JPanel();
		GridLayout glP1 = new GridLayout(2,3); 
		labelFrom = new JLabel("Copy from: ");
		labelTo = new JLabel("Copy to:");
		textFrom = new JTextField();
		textTo = new JTextField();
		buttonFrom = new JButton("Browse");
		buttonTo = new JButton("Browse");
		p1.setLayout(glP1);
		p1.add(labelFrom);
		p1.add(textFrom);
		p1.add(buttonFrom);
		p1.add(labelTo);
		p1.add(textTo);
		p1.add(buttonTo);
		windowsContent.add("Center", p1);
		p2 = new JPanel();
		FlowLayout fl = new FlowLayout();
		p2.setLayout(fl);
		buttonCopy = new JButton("Copy");
		p2.add(buttonCopy);
		windowsContent.add("South", p2);
		
		
		JFrame frame = new JFrame("File copy");
		frame.add(windowsContent);
		frame.setSize(300, 130);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}