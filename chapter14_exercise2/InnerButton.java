//=========================================question===============================================
/*
                                        Be the compiler

The Java file on this page represents a
complete source file. Your job is to play
compiler and determine whether this file
will compile. If it won’t compile, how
would you fix it, and if it does
compile, what would it do?

=========================================source code===============================================*/
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class InnerButton {
    private JButton button;
    public static void main(String[] args) {
        InnerButton gui = new InnerButton();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE);
        button = new JButton("A");
        button.addActionListener();
        frame.getContentPane().add(
            BorderLayout.SOUTH, button);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
    class ButtonListener extends ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (button.getText().equals("A")) {
                button.setText("B");
            } else {
                button.setText("A");
            }
        }
    }
*/
/*=========================================error==================================================
 firstly actionListner is an interface so its implements and not extends.
 secondly The addActionListener( ) method takes a class that implements the ActionListener
 interface and we called it without arguments.

=========================================corrected code============================================
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class InnerButton {
    private JButton button;
    public static void main(String[] args) {
        InnerButton gui = new InnerButton();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE);
        button = new JButton("A");
        button.addActionListener(new ButtonListener());
        frame.getContentPane().add(
            BorderLayout.SOUTH, button);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (button.getText().equals("A")) {
                button.setText("B");
            } else {
                button.setText("A");
            }
        }
    }
}