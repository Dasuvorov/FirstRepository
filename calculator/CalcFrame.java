import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalcFrame extends JFrame{
	
	JTextArea display = new JTextArea();
	JPanel buttonPanel = new JPanel(new GridLayout(5,3));
	JButton button0 = new JButton("0");
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton buttonSum = new  JButton("+");
	JButton buttonBack = new JButton("C");
	JButton buttonDevide = new  JButton("/");
	JButton buttonSub = new JButton("-");
	JButton buttonMul =  new JButton("*");
	JButton buttonStart = new JButton("=");

	CalcFrame(){
		System.out.println("Привет Джава");
		setBounds(300,300,300,300);
		setLayout(new BorderLayout());
		add(display,BorderLayout.NORTH);
		add(buttonPanel,BorderLayout.CENTER);
		add(buttonStart, BorderLayout.SOUTH);
		buttonPanel.add(button7);
		buttonPanel.add(button8);
		buttonPanel.add(button9);
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(button0);
		buttonPanel.add(buttonSum);
		buttonPanel.add(buttonSub);
		buttonPanel.add(buttonMul);
		buttonPanel.add(buttonBack);
		buttonPanel.add(buttonDevide);
		
		

		setVisible(true);
	}
	
		public static void main(String[] args){
			CalcFrame calcFrame = new CalcFrame();
			calcFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		
		}

}