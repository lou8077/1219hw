package hw_ch5;
import javax.swing.*;
import java.awt.*;

class HelloSwing { // 去掉 public
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        JLabel label = new JLabel("Hello, Java Swing!", SwingConstants.CENTER);

        label.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}