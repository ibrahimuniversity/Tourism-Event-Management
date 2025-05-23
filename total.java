
package com.mycompany.gggggg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.text.*;
import java.text.ParseException;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class total extends JFrame {
    private int totalAmount = 0;
    private JComboBox<String> ticketTypeCombo;
    private JComboBox<String> extraItemCombo;
    private JTextField extraQuantityField;
    private JTextField ticketQuantityField;
    private JLabel totalLabel;
     private CardLayout cardLayout;
    private JPanel mainPanel;
    
    private void calculateTotal() {
        int ticketPrice = switch (ticketTypeCombo.getSelectedIndex()) {
            case 0 -> 50;
            case 1 -> 30;
            case 2 -> 20;
            default -> 0;
        };

        int extraPrice = switch (extraItemCombo.getSelectedIndex()) {
            case 0 -> 20;
            case 1 -> 10;
            case 2 -> 80;
            default -> 0;
        };

        try {
            int ticketCount = Integer.parseInt(ticketQuantityField.getText().trim());
            int extraCount = Integer.parseInt(extraQuantityField.getText().trim());

            if (ticketCount < 0 || extraCount < 0) throw new NumberFormatException();

            totalAmount = (ticketCount * ticketPrice) + (extraCount * extraPrice);
            totalLabel.setText("💵 Total Price: SR" + totalAmount);

            cardLayout.show(mainPanel, "PaymentPage");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter valid positive numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   
}
