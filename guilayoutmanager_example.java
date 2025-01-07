package guiLayoutManagerPackage;

// imports features that let me use certain code
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guiLayoutManager extends JFrame implements ActionListener {

    // creating private variables
    private GridBagLayout gbLayout;
    private GridBagConstraints btnConstraints;
    private GridBagConstraints lblConstraints;
    private GridBagConstraints pnlConstraints;
    private Container container;
    private JButton btnDog, btnCat, btnMouse, btnHorse;

    public guiLayoutManager() {

        //Set window name
        super("GUI Layout Manager");

        //Initialize container and set it's layout
        container = getContentPane();
        gbLayout = new GridBagLayout();
        container.setLayout( gbLayout );

        //Set the constraints for the buttons
        btnConstraints = new GridBagConstraints();
        btnConstraints.fill = GridBagConstraints.HORIZONTAL;
        btnConstraints.insets = new Insets(5,5,5,5);
        btnConstraints.weightx = 1;

        //Set the constraints for the label
        lblConstraints = new GridBagConstraints();
        lblConstraints.anchor = GridBagConstraints.CENTER;

        //Set the constraints for the panel
        pnlConstraints = new GridBagConstraints();
        pnlConstraints.gridy = 0;
        pnlConstraints.gridwidth = GridBagConstraints.REMAINDER;

        //Initialize all contents of the window
        JPanel panel = new JPanel();
        JLabel label = new JLabel("This Program Demonstrates the GUI Layout Manager");
        ImageIcon btnIcon = new ImageIcon("C:\\gridBagProject\\images\\soccerBall.jpg");
        btnIcon = new ImageIcon(btnIcon.getImage().getScaledInstance(140, 80, java.awt.Image.SCALE_SMOOTH));
        btnDog = new JButton("Dog", btnIcon);
        btnCat = new JButton("Cat");
        btnMouse = new JButton("Mouse");
        btnHorse = new JButton("Horse");

        //Add action listener to each button
        btnDog.addActionListener(this);
        btnCat.addActionListener(this);
        btnMouse.addActionListener(this);
        btnHorse.addActionListener(this);

        //Add all the components to the container
        panel.add(label, lblConstraints);
        container.add(panel, pnlConstraints);
        container.add(btnDog, btnConstraints);
        container.add(btnCat, btnConstraints);
        container.add(btnMouse, btnConstraints);
        container.add(btnHorse, btnConstraints);

        //Make the container visible, set it's size and show it
        container.setVisible(true);
        setSize(300,300);
        show();

    } // end of public guiLayoutManager


    //Checks which button was pressed, and runs code based on the pressed button
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnDog) {
            JOptionPane.showMessageDialog(null, "Bark!");
        }else if(e.getSource() == btnCat) {
            JOptionPane.showMessageDialog(null, "Meow");
        }else if(e.getSource() == btnMouse) {
            JOptionPane.showMessageDialog(null, "Squeak Squeak");
        }else if(e.getSource() == btnHorse) {
            JOptionPane.showMessageDialog(null, "Neigh");
        }
    } // end of handler

    public static void main(String [] args) {
        new guiLayoutManager();
    } // end of main method
} // end of class
