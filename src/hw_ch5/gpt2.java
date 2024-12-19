package hw_ch5;
import java.awt.*;
import java.awt.event.*;

// 移除 public 關鍵字
class ButtonExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Button Example");
        Button button = new Button("Click Me");

        button.setBounds(50, 100, 80, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        frame.add(button);
        frame.setSize(200, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}