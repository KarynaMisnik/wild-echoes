import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickableGame extends JFrame {

    public ClickableGame() {
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel with background
        JPanel panel = new JPanel() {
            private Image bg = new ImageIcon("forest.jpg").getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(null);

        // Example clickable area (like a bear)
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (x >= 300 && x <= 400 && y >= 200 && y <= 300) {
                    System.out.println("Bear clicked! Choose what to do...");
                }
            }
        });

        add(panel);
        setVisible(true);
    }
}