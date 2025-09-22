import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {

    Menu() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    }

}
