import java.awt.*;
import javax.swing.*;
public class SwingTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextField Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout()); // Mengatur tata letak
        JLabel label = new JLabel("Masukkan Nama:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");
        button.addActionListener(e -> {
            String nama = textField.getText();
            JOptionPane.showMessageDialog(frame, "Halo, " + nama);
        });
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.setVisible(true);
    }   
}