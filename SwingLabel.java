import javax.swing.*;
public class SwingLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Selamat datang di JavaSwing!", SwingConstants.CENTER);
        frame.add(label); // Menambahkan label ke dalam frame
        frame.setVisible(true);
    }
}