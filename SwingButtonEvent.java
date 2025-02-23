import javax.swing.*;
public class SwingButtonEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Event Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Klik Saya!");
        button.addActionListener(e ->
        JOptionPane.showMessageDialog(frame, "Tombol diklik!")); //Menampilkan pop-up
        frame.add(button);
        frame.setVisible(true);
    }
}