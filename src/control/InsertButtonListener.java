package control;

import view.MyWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertButtonListener implements ActionListener {

    private MyWindow win;
    private JTextArea display;
    private JRadioButton[] rbuttons;


    public InsertButtonListener(MyWindow win) {
        this.win = win;
        display = win.getDisplay();
        rbuttons = win.getRbuttons();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");
    }
}
