package control;

import view.MyWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class emptyButtonListener implements ActionListener {
    int emptycount = 0;

    private MyWindow win;
    private JTextArea display;

    public emptyButtonListener(MyWindow win) {
        this.win = win;
        display = win.getDisplay();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Main.piggyBank.empty();
        display.setText("Your piggyBank is empty! Insert a coin to start over.\n" +
                "You have emptied your piggyBank " + ++emptycount + " times.");
    }
}
