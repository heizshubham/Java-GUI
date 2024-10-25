import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        // JFrame = a GUI window to add components to

        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("Shubham"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets default close operation
        // frame.setResizable(false); //prevent frame from being resized
        frame.setSize(300, 200); //sets size of frame //set the x-dimension, and y-dimension of frame
        frame.setVisible(true); //makes frame visible

        ImageIcon image = new ImageIcon("Image.jpeg"); //create an ImageIcon
        frame.setIconImage(image.getImage()); //change icon of frame
        // frame.getContentPane().setBackground(new Color(50,50,200)); //change color of background
        frame.getContentPane().setBackground(new Color(0x123456)); //change color of background
        


    }
}