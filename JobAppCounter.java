import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JobAppCounter extends JFrame {
    private int count = 0;
    private JLabel countLabel;

    public JobAppCounter() {
        setTitle("Job Application Counter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Label
        countLabel = new JLabel("Applications Sent: 0", SwingConstants.CENTER);
        countLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(countLabel, BorderLayout.CENTER);

        // Buttons Panel
        JPanel buttonPanel = new JPanel();
        JButton incrementButton = new JButton("Increment");
        JButton resetButton = new JButton("Reset");

        // Add to panel
        buttonPanel.add(incrementButton);
        buttonPanel.add(resetButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Button Actions
        incrementButton.addActionListener(e -> {
            count++;
            updateLabel();
        });

        resetButton.addActionListener(e -> {
            count = 0;
            updateLabel();
        });

        setVisible(true);
    }

    private void updateLabel() {
        countLabel.setText("Applications Sent: " + count);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JobAppCounter::new);
    }
}