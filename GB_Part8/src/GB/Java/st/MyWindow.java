package GB.Java.st;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    MyWindow()
    {
        setVisible(true);
        setLocation(650,650);
        setSize(500, 500);
        setTitle("Моё окно ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(1, 2));
        ActionListener actionListener = new CloseActionListener();

        JButton btn1 = new JButton("Выход");
        panel.add(btn1, BorderLayout.NORTH);
        btn1.addActionListener(actionListener);

        JButton btn2 = new JButton("New кнопка");
        panel.add(btn2, BorderLayout.SOUTH);

        add(panel, BorderLayout.SOUTH);
    }


}
