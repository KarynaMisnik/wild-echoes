import javax.swing.*;
import java.awt.*;

class ClickableImage extends JPanel {

    private Image background = new ImageIcon("forest.png").getImage();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
    }

}
