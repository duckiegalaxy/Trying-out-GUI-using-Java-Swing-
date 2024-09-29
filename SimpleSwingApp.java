import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleSwingApp {
    static int count = 0;
    static JLabel label;
    static JFrame frame;
    static JPanel panel;

    public static void main(String[] args) {
        frame = new JFrame("Simple Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        label = new JLabel("Number of clicks: " + count);
        panel.add(label);
        ImageIcon image = new ImageIcon("C:\\Users\\HP\\OneDrive\\Desktop\\ex.png");
        if (image.getIconWidth() == -1) {
            System.out.println("Image not found at the specified path.");
            return;
        }
        JButton button = new JButton("HIII", image);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "HI AGAIN");
                count++;
                label.setText("Number of clicks: " + count);
            }
        });
        button.setBackground(Color.PINK);
        button.setForeground(Color.DARK_GRAY);
        panel.add(button);
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
