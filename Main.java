import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame("CALCULADORA");
        frame.setContentPane(new form1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,800);
        frame.pack();
        frame.setVisible(true);
    }
}