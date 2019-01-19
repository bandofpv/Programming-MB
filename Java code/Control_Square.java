//Imports the nessary liabraries
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Control_Square  extends JPanel implements KeyListener{ //extend JPanel and implement KeyListener libraries
    
    int x = 250; //Create x coordinate to 250
    int y = 250; //Create y coordinate to 250

    
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed:"); //Print Key typed if a key was typed
    }
    
    public void keyReleased(KeyEvent e) {
    	System.out.println("Key Released"); //Print key Released if a key was released
    }

    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_DOWN){ //if the key that was pressed is equal to arrow down key
            System.out.println("Down"); //Print Down
            y += 2; //make y equal to y + 2

            repaint(); //repaint graphic
        }
        
        if(e.getKeyCode() == KeyEvent.VK_UP){ //if the key that was pressed is equal to arrow up key
            System.out.println("Up"); //Print Up
            y -= 2; //Make y equal to y - 2

            repaint(); //repaint graphic
        }
        
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){ //if the key that was pressed is equal to arrow right key
            System.out.println("Right"); //Print Right
            x += 2; //Make x equal to x - 2

            repaint(); //repaint graphic
        }
        
        if(e.getKeyCode() == KeyEvent.VK_LEFT){ //if the key that was pressed is equal to arrow left key
            System.out.println("Left"); //Print Left
            x -= 2; //Make x equal to x - 2

            repaint(); //repaint graphic
        }
    }

    public void paint(Graphics g){
    	super.paint(g); //super basically prints the new graphic and earases the orignal graphic

        g.setColor(Color.BLACK); //set the color of graphic to Black
        g.drawRect(x ,y,100,100); //set the coordinate and size of graphic
        
        repaint(); //repaint graphic
    }

    public static void main(String[] args){

        Control_Square controlsquare = new Control_Square(); //Create controlsquare object
        JFrame f = new JFrame(); //Create f object

        f.setVisible(true); //set JFrame object to visible (the background)
        f.setSize(700,700); //set background size
        controlsquare.setBackground(Color.WHITE); //set color of background to white
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close thing that you have to do if modifying the graphic
        f.addKeyListener(controlsquare); //add key listener to graphic
        f.add(controlsquare); //add control square to f
        f.repaint(); //repaint graphic         
    }
}
