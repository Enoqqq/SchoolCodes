

package layout;

/*
 * CardLayoutDemo.java
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutDemo implements ItemListener {
    JPanel cards; //a panel that uses CardLayout
    final static String BUTTONPANEL = "jake is ok";
    final static String TEXTPANEL = "tweedy is fine i guess";
    final static String FRAMEPANEL = "zach is awsome";
    final static String LAMEPANEL = "zach is just plain better";
    final static String BLAMEPANEL = "zach is superior";
    final static String SHAMEPANEL = "zach the gr8";
    
    public void addComponentToPane(Container pane) {
        //Put the JComboBox in a JPanel to get a nicer look.
        JPanel comboBoxPane = new JPanel(); //use FlowLayout
        String comboBoxItems[] = { BUTTONPANEL, TEXTPANEL, FRAMEPANEL, LAMEPANEL, BLAMEPANEL, SHAMEPANEL };
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setEditable(false);
        cb.addItemListener(this);
        comboBoxPane.add(cb);
        
        //Create the "cards".
        JPanel card1 = new JPanel();
        card1.add(new JButton("Zach is superior"));
        card1.add(new JButton("Zach is awsome"));
        card1.add(new JButton("Zach pwns nooblets WTF lolloo!!11!one!!"));
        card1.add(new JButton("Zach is 1337 and crushes teh nubs"));
        card1.add(new JTextField("Zach is superior", 20));
        
        JPanel card2 = new JPanel();
        card2.add(new JTextField("ahaha", 20));
        card2.add(new JTextField("lol", 20));
        card2.add(new JTextField("rofl", 20));
        card2.add(new JTextField("pwn", 20));
                
        JPanel card3 = new JPanel();
        card3.add(new JButton("AHAHAHA"));
        card3.add(new JButton("No"));
        card3.add(new JButton("Click to asplode"));
        card3.add(new JButton("click to punch in da face"));
        
        JPanel card4 = new JPanel();
        card4.add(new JButton("lots of cards"));
        card4.add(new JTextField("pwn", 20));
        
        JPanel card5 = new JPanel();
        card5.add(new JButton("lots of cards"));
        card5.add(new JTextField("pwn", 20));
        
        JPanel card6 = new JPanel();
        card6.add(new JButton("lots of cards"));
        card6.add(new JButton("lots of cards"));
        card6.add(new JButton("lots of cards"));
        card6.add(new JButton("lots of cards"));
        card6.add(new JButton("lots of cards"));
        card6.add(new JButton("lots of cards"));
        card6.add(new JButton("lots of cards"));
        card6.add(new JButton("lots of cards"));
        card6.add(new JButton("lots of cards"));
        card6.add(new JButton("lots of cards"));
        card6.add(new JButton("lots of cards"));
        card6.add(new JButton("lots of cards"));
        
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(card1, BUTTONPANEL);
        cards.add(card2, TEXTPANEL);
        cards.add(card3, FRAMEPANEL);
        cards.add(card4, LAMEPANEL);
        cards.add(card5, BLAMEPANEL);
        cards.add(card6, SHAMEPANEL);
               
        pane.add(comboBoxPane, BorderLayout.PAGE_START);
        pane.add(cards, BorderLayout.CENTER);
    }
    
    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
    }
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("CardLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create and set up the content pane.
        CardLayoutDemo demo = new CardLayoutDemo();
        demo.addComponentToPane(frame.getContentPane());
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
