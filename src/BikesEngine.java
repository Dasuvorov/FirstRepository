import java.util.Random;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BikesEngine implements ActionListener {

    Bikes parent;
        BikesEngine(Bikes parent){
            this.parent = parent;
        }

    @Override
    public void actionPerformed(ActionEvent e) {
         Random random = new Random();
        int r = 0;
        JButton clickedButton = (JButton) e.getSource();
        String quant = parent.textQuantity.getText();
        String  model = parent.textModel.getText();

        if(!"".equals(quant)){

            int quantity = Integer.parseInt(quant);
            if (quantity > 3){
                JOptionPane.showMessageDialog(null, "Нельзя заказывать больше " +
                        "трех вещей за один  раз", "ERORR ",JOptionPane.ERROR_MESSAGE);
            }            else{ JOptionPane.showMessageDialog(null, "Ваш заказ № "  +
                            (r = random.nextInt(999999)) + " модель " +  model +  " принят",
                    "Менеджер с вами свяжется ",JOptionPane.PLAIN_MESSAGE);}
        }


    }
}
