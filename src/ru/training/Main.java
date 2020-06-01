package ru.training;
import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    public Main() {
        super("Hello App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        initComponents();

        setLayout(null);
        setVisible(true);
    }
    private void initComponents() {
        JLabel nameLabel = new JLabel("Your name");
        nameLabel.setBounds(40,20,100,30);
        add(nameLabel);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(140, 20, 120, 30);
        add(nameTextField);

        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(40, 150, 220, 70);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.setBackground(Color.YELLOW);
        add(greenPanel);

        JButton acceptButton = new JButton("accept");
        acceptButton.setBounds(100, 70, 100, 30);
        add(acceptButton);

        JLabel helloLabel = new JLabel("Hello");
        helloLabel.setBounds(50, 20, 100, 30);
        helloLabel.setHorizontalAlignment(SwingConstants.CENTER);
        helloLabel.setVerticalAlignment(SwingConstants.CENTER);

        Font font = new Font("Courrier", Font.BOLD, 12);
        helloLabel.setFont(font);
        helloLabel.setFont(helloLabel.getFont().deriveFont(16f));

        greenPanel.add(helloLabel);

            acceptButton.addActionListener(e -> {
            String helloText = "Hello";
            String name = nameTextField.getText();
            if(name != null && name.trim().length() > 0) {
                helloText += String.format(", %s", name);
            }
            helloLabel.setText(helloText);
        });
    }
    public static void main(String[] args) {
        new Main();
    }
}