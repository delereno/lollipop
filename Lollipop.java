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
    private void drawLollipop() {
        UI.setLineWidth(10);                // set line width to 10
        //draw a line (300, 200) to (300, 400)
        UI.drawLine(300, 200, 300, 400);    
        /* Drawing the Lolly */
        UI.setLineWidth(1);                 //set line width to 1
        
        UI.setColor(Color.red);             //set color to red
        UI.fillOval(260, 160, 80, 80);      //fill oval @(260, 160), 80x80
        
         
    }


    /**
     * Creates and draws lollipop
     * @param args arguments
     */
    public static void main(String[] args) {
        Lollipop obj = new Lollipop();
        obj.drawLollipop();                 //call the lollipop
    }

}

