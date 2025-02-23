import java.awt.*;
import javax.swing.*;

public class ChristopanSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextField Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout()); 
        JLabel labelNama = new JLabel("Masukkan Nama:");
        JTextField textNama = new JTextField(15);
        JLabel labelUsia = new JLabel("Masukkan Usia:");
        JTextField textUsia = new JTextField(15);
        JButton button = new JButton("Submit");
        button.addActionListener(e -> {
            String nama = textNama.getText();
            String usia = textUsia.getText();
            JOptionPane.showMessageDialog(frame, "Halo, " + nama + "! Usia Anda adalah " + usia + " tahun.");
        });
        frame.add(labelNama);
        frame.add(textNama);
        frame.add(labelUsia);
        frame.add(textUsia);
        frame.add(button);
        frame.setVisible(true);
    }
}
