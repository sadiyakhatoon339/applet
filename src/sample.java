/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
*/
import java.awt.*;
import java.applet.Applet;


/*
<applet code="sample" width=1000 height=50>
</applet>
*/
 
public class sample extends Applet {
   
    String msg=" ";
    
    public void init()
    {
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg="Inside init()......";
    }
    public void start()
    {
        msg="Inside start()......";
    }
    public void paint(Graphics g)
    {
     
        msg="Inside paint()......";
        g.drawString(msg,10,5);
    }
}
        
       




    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
    // TODO overwrite start(), stop() and destroy() methods

