
package com.mycompany.gggggg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class EventWindow extends JFrame {
    
    private static void showEventWindow(String category, String[] events) {
        JFrame eventframe = new JFrame(category);
        eventframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        eventframe.setSize(300, 250);
        eventframe.setLayout(new BorderLayout(10, 10));
        eventframe.setLocationRelativeTo(null);

        JLabel titleLabel = new JLabel("Select an event", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        eventframe.add(titleLabel, BorderLayout.NORTH);

        JPanel eventpanel = new JPanel(new GridLayout(0, 1, 5, 5));
        for (String event : events) {
            JButton btn = new JButton(event);
            btn.addActionListener(e -> {
                JOptionPane.showMessageDialog(
                        eventframe,
                        "You selected:\nCategory: " + category + "\nEvent: " + event,
                        "Your Selection",
                        JOptionPane.INFORMATION_MESSAGE
                );
            });
            eventpanel.add(btn);
        }
        eventframe.add(eventpanel, BorderLayout.CENTER);
        eventframe.setVisible(true);
    }
    
}
