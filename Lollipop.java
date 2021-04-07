/* Based on the ecs 100 template
 * Code for ??
 * Name:
 * Date:
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;


/** 
 * excercise where we draw a lollipop
 * 
 * @author del h
 * @version 1/04/2021
 */
public class Lollipop {
    /*fields*/
    public static final double X = 300.0;     // horizontal center of lollipop
    public static final double Y = 180.0; // vertical center of lollipop 
    public static final double SIZE = 80.0; // diameter of lollipop
    public static final double STICK = 200.0; // length of the lollipop stick
    /**
     * constructor for lollipop
     */
    public Lollipop() {
        UI.initialise();
        //UI.addButton("Quit", UI::quit);
    
    }
    /**
     * Draw a red lollipop on a stick
     */
    private void drawLollipop(double x, double y, double size, double stick) {
        double left = x-size/2.0;
        double top = y-size/2.0;
        double bottom = y+stick;
        // UI.setColor(Color.black);
        // UI.setLineWidth(size/8.0);                // set line width to 10
        // //draw a line (300, 200) to (300, 400)
        // UI.drawLine(x, y, x, bottom);    
        // /* Drawing the Lolly */
        // UI.setLineWidth(1);                 //set line width to 1
        
        UI.setColor(Color.red);             //set color to red
        UI.fillOval(left, top, size, size);      //fill oval @(260, 160), 80x80
        
         
    }

    /**
     *Calls the drawLollipop method with a number of different parameters 
     */
    public void doDrawLollipop(){
        // asks user for diameter
        double diam = UI.askDouble("Diameter: ");
        drawLollipop(300, 180, diam, 200);
        drawLollipop(50, 60, diam/2.0, 90);
        drawLollipop(400, 100, diam, 70);
        
    }
    /**
     * Creates and draws lollipop
     * @param args arguments
     */
    public static void main(String[] args) {
        Lollipop obj = new Lollipop();
        obj.doDrawLollipop();                 //call the lollipop
    }

}

