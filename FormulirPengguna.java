import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FormulirPengguna {
    public static void main(String[] args) {
        // Membuat JFrame
        JFrame frame = new JFrame("Aplikasi Formulir Pengguna");
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2, 1, 1));

        // Label untuk nama dan usia
        JLabel labelNama = new JLabel("Masukkan Nama:");
        JTextField inputNama = new JTextField();

        JLabel labelUsia = new JLabel("Masukkan Usia:");
        JTextField inputUsia = new JTextField();

        // Tombol Submit
        JButton tombolSubmit = new JButton("Submit");

        // Menambahkan action listener pada tombol
        tombolSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = inputNama.getText();
                String usia = inputUsia.getText();
                JOptionPane.showMessageDialog(frame, "Halo, " + nama + "! Usia Anda adalah " + usia + " tahun.");
            }
        });

        // Menambahkan komponen ke dalam frame
        frame.add(labelNama);
        frame.add(inputNama);
        frame.add(labelUsia);
        frame.add(inputUsia);
        frame.add(new JLabel()); // Placeholder
        frame.add(tombolSubmit);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
