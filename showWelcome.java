
package com.mycompany.gggggg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class showWelcome extends JFrame {

private static void showWelcomeBack() {
        JFrame welcomeFrame = new JFrame("Welcome");
        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeFrame.setSize(400, 300);
        welcomeFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        JLabel welcomeLabel = new JLabel("Welcome back", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(welcomeLabel);

        JButton eventsButton = new JButton("View Tourist Events");
        JButton settingsButton = new JButton("Account Settings");
        JButton bookingsButton = new JButton("My Bookings");

        panel.add(eventsButton);
        panel.add(settingsButton);
        panel.add(bookingsButton);

        welcomeFrame.add(panel);
        welcomeFrame.setVisible(true);
    }
}