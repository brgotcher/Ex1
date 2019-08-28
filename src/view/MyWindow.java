package view;

import control.InsertButtonListener;
import control.emptyButtonListener;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    private JTextArea display = new JTextArea("Welcome to PiggyBank Simulator");
    private JRadioButton[] rbuttons = new JRadioButton[5];
    private JButton insertButton = new JButton("Insert a coin");
    private JButton emptyButton = new JButton("Empty the bank");
    public void init() {
        setSize(500, 300);
        setLocation(200, 100);
        setTitle("PiggyBank simulator");

        Container cp = getContentPane();
        JScrollPane scrollPane = new JScrollPane(display,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        cp.add(BorderLayout.CENTER, scrollPane);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(3, 1));

        JPanel radioPanel = new JPanel();
        ButtonGroup radioGroup = new ButtonGroup();
        for (int i = 0; i < rbuttons.length; i++) {
            rbuttons[i] = new JRadioButton();
            radioPanel.add(rbuttons[i]);
            radioGroup.add(rbuttons[i]);
        }
        rbuttons[0].setText("1 cent");
        rbuttons[1].setText("5 cents");
        rbuttons[2].setText("10 cents");
        rbuttons[3].setText("25 cents");
        rbuttons[4].setText("1 dollar");

        bottomPanel.add(radioPanel);
        bottomPanel.add(insertButton);
        bottomPanel.add(emptyButton);
        emptyButton.setBackground(Color.red);

        cp.add(BorderLayout.SOUTH, bottomPanel);

        //even listener
        insertButton.addActionListener(new InsertButtonListener(this));
        emptyButton.addActionListener(new emptyButtonListener(this));
    }
    public JTextArea getDisplay() {
        return display;
    }
    public JRadioButton[] getRbuttons() {
        return rbuttons;
    }
}
