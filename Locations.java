/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gggggg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Locations {

    String regions[] = {"Riyadh","AlQassim","Asir","Eastern Province","Medinah","Makkah"};
    String riyadhCitys[] = {"Riyadh","Az Zulfi","Almajmmah","AlKarj"};
    String qassimCitys[] = { "Buraydah","Unizah"};
    String asirCitys[] = {"Abha","Alnmas"};
    String easternCitys[] = {"Dammam","Al Khobar"};
    String makkahCitys[] = {"Jeddah","Makkah"};
    String medinahCitys[] = {"Madinah","Yunba"};



public class LocationsGUI {

    {
        JFrame frame = new JFrame("Region and City Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        Locations data = new Locations();

        JLabel regionLabel = new JLabel("Select Region:");
        JComboBox<String> regionComboBox = new JComboBox<String>(data.regions);

        JLabel cityLabel = new JLabel("Select City:");
        JComboBox<String> cityComboBox = new JComboBox<String>();

        // Initialize with cities of the first region
        cityComboBox.setModel(new DefaultComboBoxModel<String>(data.riyadhCitys));

        regionComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedRegion = (String) regionComboBox.getSelectedItem();
                String[] cities = {};

                switch (selectedRegion) {
                    case "Riyadh":
                        cities = data.riyadhCitys;
                        break;
                    case "AlQassim":
                        cities = data.qassimCitys;
                        break;
                    case "Asir":
                        cities = data.asirCitys;
                        break;
                    case "Eastern Province":
                        cities = data.easternCitys;
                        break;
                    case "Medinah":
                        cities = data.medinahCitys;
                        break;
                    case "Makkah":
                        cities = data.makkahCitys;
                        break;
                }

                cityComboBox.setModel(new DefaultComboBoxModel<String>(cities));
            }
        });

        JButton showButton = new JButton("Show Selection");
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String region = (String) regionComboBox.getSelectedItem();
                String city = (String) cityComboBox.getSelectedItem();
                JOptionPane.showMessageDialog(frame, "Region: " + region + "\nCity: " + city);
            }
        });

        frame.add(regionLabel);
        frame.add(regionComboBox);
        frame.add(cityLabel);
        frame.add(cityComboBox);
        frame.add(new JLabel()); // empty cell
        frame.add(showButton);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
}