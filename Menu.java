import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import java.util.Random;

public class Menu extends JFrame {

    public Menu() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setLayout(new BorderLayout());

        // JTextPane allows colored text
        JTextPane landscapePane = new JTextPane();
        landscapePane.setFont(new Font("Monospaced", Font.PLAIN, 12));
        landscapePane.setEditable(false);
        landscapePane.setBackground(Color.BLACK);

        JScrollPane scrollPane = new JScrollPane(landscapePane);
        this.add(scrollPane, BorderLayout.CENTER);

        // Generate and display colored ASCII landscape
        generateColoredLandscape(landscapePane, 40, 80);

        // Simple menu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }

    private void generateColoredLandscape(JTextPane pane, int rows, int cols) {
        Random rand = new Random();
        char[] symbols = { '^', '~', '.', '"' }; // mountains, water, plains, grass

        // Get the styled document to insert colored text
        StyledDocument doc = pane.getStyledDocument();

        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {
                char symbol = symbols[rand.nextInt(symbols.length)];
                Color color;

                switch (symbol) {
                    case '^':
                        color = Color.LIGHT_GRAY;
                        break; // mountain
                    case '~':
                        color = Color.CYAN;
                        break; // water
                    case '"':
                        color = Color.GREEN;
                        break; // grass
                    default:
                        color = Color.YELLOW; // plains
                }

                // Create a style for the character
                Style style = pane.addStyle("style", null);
                StyleConstants.setForeground(style, color);

                try {
                    doc.insertString(doc.getLength(), String.valueOf(symbol), style);
                } catch (BadLocationException e) {
                    e.printStackTrace();
                }
            }
            try {
                doc.insertString(doc.getLength(), "\n", null);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Menu::new);
    }
}
