import javax.swing.*;
import java.awt.*;

public class IntroductionPanel extends JPanel {

    public IntroductionPanel() {
        setBackground(new Color(60, 179, 113)); // nice green
        setLayout(new GridBagLayout());

        JLabel label = new JLabel("You are in the game!");
        label.setFont(new Font("Arial", Font.BOLD, 28));
        label.setForeground(Color.WHITE);

        add(label);
    }
}