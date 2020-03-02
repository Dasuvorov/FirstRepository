import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class Bikes {
    String[] list;
    String model;
    String quantity;
    JFrame frame;
    JPanel panel;
    JTextField textModel;
    JTextField textQuantity;
    JButton buttonOrder;

    Bikes() {
        this.model = model;
        this.quantity = quantity;



        frame = new JFrame("Bike Shop");
         panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(3, 1));

        textModel = new JTextField(10);
        textQuantity = new JTextField(10);
        buttonOrder = new JButton("order");
        panel.add(textModel);
        panel.add(textQuantity);
        panel.add(buttonOrder);




        frame.setSize(400, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        BikesEngine bikesEngine = new BikesEngine(this);
        buttonOrder.addActionListener(bikesEngine);

    }
        public static void main (String[]args){

            Bikes bikes = new Bikes();


        }

    }
