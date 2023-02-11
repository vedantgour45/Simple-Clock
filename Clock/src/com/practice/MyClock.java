package com.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MyClock extends JFrame {   //inheritance

    private JLabel heading;
    private JLabel ClockLabel;

    private Font font = new Font("Verdana", Font.BOLD, 35);

    MyClock() {
        super.setTitle("My Clock");
        super.setSize(700,300);
        super.setLocation(300, 50);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
        super.setResizable(false);
    }

    public void createGUI() {

        heading = new JLabel("Vedant's Clock");
        ClockLabel = new JLabel("clock");

        heading.setFont(font);
        ClockLabel.setFont(font);

        this.setLayout(new GridLayout(2, 1));
        this.add(heading);
        this.add(ClockLabel);

    }

    public void startClock() {
        Timer timer = new Timer(1000, new ActionListener() { //1000 mili sec means 1 sec, after which object will be called again and again
            @Override
            public void actionPerformed(ActionEvent e) {
                String dateTime = new Date().toString();
//                String dateTime = new Date().toLocaleString();
                ClockLabel.setText(dateTime);
            }
        });

        timer.start();
    }
}