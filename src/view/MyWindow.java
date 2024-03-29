package view;

import control.InsertButtonListener;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    private JTextArea display = new JTextArea("Welcome to PiggyBank Simulator");
    private JRadioButton[] rbuttons = new JRadioButton[3];
    private JButton insertButton = new JButton("Insert a coin");
    public void init() {
        setSize(500, 300);
        setLocation(200, 100);
        setTitle("PiggyBank simulator");

        Container cp = getContentPane();
        JScrollPane scrollPane = new JScrollPane(display,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        cp.add(BorderLayout.CENTER, display);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2, 1));

        JPanel radioPanel = new JPanel();
        ButtonGroup radioGroup = new ButtonGroup();
        for (int i = 0; i < rbuttons.length; i++) {
            rbuttons[i] = new JRadioButton();
            radioPanel.add(rbuttons[i]);
            radioGroup.add(rbuttons[i]);
        }
        rbuttons[0].setText("5 cents");
        rbuttons[1].setText("10 cents");
        rbuttons[2].setText("25 cents");

        bottomPanel.add(radioPanel);
        bottomPanel.add(insertButton);

        cp.add(BorderLayout.SOUTH, bottomPanel);

        //even listener
        insertButton.addActionListener(new InsertButtonListener(this));
    }
    public JTextArea getDisplay() {
        return display;
    }
    public JRadioButton[] getRbuttons() {
        return rbuttons;
    }
}
