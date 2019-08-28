package control;

import model.Coin;
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
        int value = 0;
        if (rbuttons[0].isSelected()) {
            value = 5;
        } else if (rbuttons[1].isSelected()) {
            value = 10;
        } else if (rbuttons[2].isSelected()){
            value = 25;
        }

        if (value != 0) {
            display.setText("Coin " + value + " is selected");
        }

        Main.piggyBank.insert(new Coin(value));
    }
}
