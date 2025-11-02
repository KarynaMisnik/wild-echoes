import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartScreen extends JFrame {

    JPanel panel;

    public StartScreen() {
        setTitle("Hiker Adventure");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setBackground(new Color(34, 139, 34));
        panel.setLayout(new GridBagLayout());

        JButton startButton = new JButton("Start");
        startButton.setFont(new Font("Arial", Font.BOLD, 24));

        // when clicked → open introduction panel in same window
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showIntroduction();
            }
        });

        panel.add(startButton);
        add(panel);
        setVisible(true);
    }

    // method to switch panel
    private void showIntroduction() {
        getContentPane().removeAll(); // remove start screen
        add(new IntroductionPanel()); // add new panel
        revalidate(); // refresh layout
        repaint();
    }
}