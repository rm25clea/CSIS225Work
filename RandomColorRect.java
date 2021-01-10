import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;
import java.util.Random;

/**
CSIS 225 Exam 1 Spring 2020

@author Jim Teresco (starter framework)
@author
 */

public class RandomColorRect  extends MouseAdapter implements Runnable {
    private Color imtrying;
    private JTextArea taMouseXY;
    protected void redraw(Graphics g) {
        Random rand = new Random();
        int red = rand.nextInt(255);
        int green = rand.nextInt(255);
        int blue = rand.nextInt(255);
        Color c = new Color(red,green,blue);
        g.setColor(c);
    }

    /**
    The run method to set up the graphical user interface
     */
    @Override
    public void run() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("RandomColorRect");
        frame.setPreferredSize(new Dimension(500,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JPanel with a paintComponent method
        JPanel panel = new JPanel() {
                @Override
                public void paintComponent(Graphics g) {

                    // first, we should call the paintComponent method we are
                    // overriding in JPanel
                    super.paintComponent(g);

                    // redraw our graphics items
                    g.fillRect(100, 100, 100, 100);
                    
                    redraw(g);
                }
            };

        frame.add(panel);
        panel.addMouseListener(this);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    public static void main(String args[]) {

        javax.swing.SwingUtilities.invokeLater(new RandomColorRect());
    }

}
