/*Line 1 - FirstGui
Line 2 - 0.1
Version starts with 0.1 until approved
Line 3 - Afolarinwa Enoch Joel Adesegun
Line 4 - Mr. DiTomasso
Line 5 - Purpose*/


package firstGuiPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class firstGuiPgm {
    /**
     * Declare objects
     */
    static JLabel label;
    static JTextField text1,text2;
    static JButton btnPlain;
    static JButton btnFancy;

    // Method to create the GUI
    private static void guiApp() {

        // Create and set up the window.
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and set up components
        JPanel panel = new JPanel();
        label = new JLabel("Selection Text");
        btnPlain = new JButton("Send text!");
        btnPlain.setActionCommand("Plain");

        // Load image and scale it
        ImageIcon gonImg = new ImageIcon("C:\\Users\\adesega303\\IdeaProjects\\untitled\\images\\adultGon.jpg");
        Image newgonImg = gonImg.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        gonImg = new ImageIcon(newgonImg);
        btnFancy = new JButton(gonImg);
        btnFancy.setActionCommand("Fancy");

        // Create a new ButtonHandler instance
        ButtonHandler onClick = new ButtonHandler();
        btnPlain.addActionListener(onClick);
        btnFancy.addActionListener(onClick);

        // Create text fields
        text1 = new JTextField("Programmers rock!", 20);
        text2 = new JTextField("Uneditable text field", 15);
        text2.setEditable(false);

        // Add components to the panel
        panel.add(btnPlain);
        panel.add(btnFancy);
        panel.add(label);
        panel.add(text1);
        panel.add(text2);

        // Set the layout manager for better component arrangement
        panel.setLayout(new FlowLayout());

        // Add panel to frame
        frame.add(panel);

        // Set size and make the frame visible
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    // Create custom event handler
    private static class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Which button was pressed?
            String command = e.getActionCommand();
            // Update label text based on which button was clicked
            if (command.equals("Plain")) {
                label.setText("You picked the plain ahh button");
            } else {
                label.setText("You picked the nen active button");
            }
        }
    }

    // Main method to run the GUI
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                guiApp();
            }
        });
    }
}
