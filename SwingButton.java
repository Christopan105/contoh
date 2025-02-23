import javax.swing.*;
public class SwingButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Klik Saya");
        frame.add(button); // Menambahkan tombol ke dalam frame
        frame.setVisible(true);
    }
}