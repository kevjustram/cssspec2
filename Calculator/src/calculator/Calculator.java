package calculator;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Calculator extends JFrame implements ActionListener {

    //declarations
    JTextArea display = new JTextArea(1, 20);
    JButton zero = new JButton("0");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton addition = new JButton("+");
    JButton subtract = new JButton("-");
    JButton multiply = new JButton("*");
    JButton division = new JButton("/");
    JButton point = new JButton(".");
    JButton equals = new JButton("=");
    JButton ac = new JButton("AC");
    JButton clear = new JButton("C");
    JButton backs = new JButton("<-");

    double num1 = 0, num2 = 0, ans = 0;
    int operation = 0, ctr = 0;

    public Calculator() throws FileNotFoundException {
        super("Calculator");
        setSize(250, 250);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints cons = new GridBagConstraints();

        //setting the format
        display.setPreferredSize(new Dimension(30, 20));
        display.setEditable(false);
        cons.gridx = 1;
        cons.gridy = 0;
        cons.gridwidth = 4;
        cons.fill = GridBagConstraints.HORIZONTAL;
        add(display, cons);

        cons.gridx = 1;
        cons.gridy = 5;
        cons.gridwidth = 2;
        cons.fill = GridBagConstraints.HORIZONTAL;
        add(zero, cons);

        cons.gridx = 1;
        cons.gridy = 4;
        cons.gridwidth = 1;
        add(one, cons);

        cons.gridx = 2;
        cons.gridy = 4;
        add(two, cons);

        cons.gridx = 3;
        cons.gridy = 4;
        add(three, cons);

        cons.gridx = 1;
        cons.gridy = 3;
        add(four, cons);

        cons.gridx = 2;
        cons.gridy = 3;
        add(five, cons);

        cons.gridx = 3;
        cons.gridy = 3;
        add(six, cons);

        cons.gridx = 1;
        cons.gridy = 2;
        add(seven, cons);

        cons.gridx = 2;
        cons.gridy = 2;
        add(eight, cons);

        cons.gridx = 3;
        cons.gridy = 2;
        add(nine, cons);

        cons.gridx = 4;
        cons.gridy = 4;
        add(addition, cons);

        cons.gridx = 4;
        cons.gridy = 3;
        add(subtract, cons);

        cons.gridx = 4;
        cons.gridy = 2;
        add(multiply, cons);

        cons.gridx = 4;
        cons.gridy = 1;
        add(division, cons);

        cons.gridx = 3;
        cons.gridy = 5;
        add(point, cons);

        cons.gridx = 4;
        cons.gridy = 5;
        add(equals, cons);

        cons.gridx = 1;
        cons.gridy = 1;
        cons.gridwidth = 3;
        cons.fill = GridBagConstraints.HORIZONTAL;
        add(ac, cons);

        //ActionListener
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        addition.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        division.addActionListener(this);
        point.addActionListener(this);
        equals.addActionListener(this);
        ac.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Numbers
        if (e.getSource() == zero) {
            display.setText(display.getText().concat("0"));
        }

        if (e.getSource() == one) {
            display.setText(display.getText().concat("1"));
        }

        if (e.getSource() == two) {
            display.setText(display.getText().concat("2"));
        }

        if (e.getSource() == three) {
            display.setText(display.getText().concat("3"));
        }

        if (e.getSource() == four) {
            display.setText(display.getText().concat("4"));
        }

        if (e.getSource() == five) {
            display.setText(display.getText().concat("5"));
        }

        if (e.getSource() == six) {
            display.setText(display.getText().concat("6"));
        }

        if (e.getSource() == seven) {
            display.setText(display.getText().concat("7"));
        }

        if (e.getSource() == eight) {
            display.setText(display.getText().concat("8"));
        }

        if (e.getSource() == nine) {
            display.setText(display.getText().concat("9"));
        }

        if (e.getSource() == point) {
            display.setText(display.getText().concat("."));
        }

        //Operations
        if (e.getSource() == addition) {
            num1 = Double.parseDouble(display.getText());
            operation = 1;
            display.setText("");
        }

        if (e.getSource() == subtract) {
            num1 = Double.parseDouble(display.getText());
            operation = 2;
            display.setText("");
        }

        if (e.getSource() == multiply) {
            num1 = Double.parseDouble(display.getText());
            operation = 3;
            display.setText("");
        }

        if (e.getSource() == division) {
            num1 = Double.parseDouble(display.getText());
            operation = 4;
            display.setText("");
        }

        if (e.getSource() == ac) {
            display.setText(null);
        }

        //Answer
        if (e.getSource() == equals) {
            num2 = Double.parseDouble(display.getText());
            switch (operation) {
                case 1:
                    ans = num1 + num2;
                    break;
                case 2:
                    ans = num1 - num2;
                    break;
                case 3:
                    ans = num1 * num2;
                    break;
                case 4:
                    ans = num1 / num2;
                    break;
                default:
                    ans = 0;
            }
            display.setText("=" + ans);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        new Calculator().setVisible(true);
    }
}