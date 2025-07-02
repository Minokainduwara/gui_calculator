import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {

    private double total1 = 0.0;
    private double total2 = 0.0;


    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton btnEquals;
    private JButton btnMulti;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnZero;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnPoint;

    public JavaCalculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(btnOneText);
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnOneText);
            }
        });

        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnThree.getText();
                textDisplay.setText(btnOneText);
            }
        });

        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnOneText);
            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnOneText);
            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnOneText);
            }
        });

        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnOneText);
            }
        });

        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnEight.getText();
                textDisplay.setText(btnOneText);
            }
        });

        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnOneText);
            }
        });

        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnOneText);
            }
        });


        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 += Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
            }
        });


        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
