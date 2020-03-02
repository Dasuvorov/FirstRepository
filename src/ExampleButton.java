import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleButton extends JFrame {

    public static void main(String[] args) {


            JFrame frame = new JFrame("Button exsample");
          //  ImageIcon iI = new ImageIcon("D:\\FirstRepository\\src\\b.png");
               JButton button = new JButton("click here");

               button.setBounds(50,100,100,30);
                   frame.add(button);
                JTextField textField = new JTextField();
               JTextField textFieldSrc = new JTextField("Hello Java");
                textField.setBounds(50,50,150,20);
                textFieldSrc.setBounds(50,200,150,20);
                frame.add(textFieldSrc);
                frame.add(textField);

            frame.setSize(400,400);
                frame.setLayout(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        if(e.getSource() == button){

                            String src = textFieldSrc.getText();
                            textField.setText(src);
                        }

                }
            });
        }

    }
