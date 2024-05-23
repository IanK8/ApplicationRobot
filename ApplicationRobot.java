import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File; 

public class ApplicationRobot{
    public static void main(String[] args) throws Exception {
        Robot oscar = new Robot();
        oscar.mouseMove(0,1250);
        oscar.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        oscar.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        oscar.delay(500);
        oscar.mouseMove(100,900);
        oscar.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        oscar.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        oscar.delay(2000);
        oscar.mouseMove(1900,550);
        oscar.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        oscar.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        oscar.delay(2000);
        oscar.mouseMove(1850,1000);
        oscar.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        oscar.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        oscar.delay(1000);
        oscar.mouseMove(1050,50);
        oscar.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        oscar.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        oscar.delay(1000);
        oscar.mouseMove(1050,150);
        oscar.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        oscar.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //screenshot
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle bounds = new Rectangle(screenSize);
        BufferedImage image= oscar.createScreenCapture(bounds); 
        File file = new File("myScreenShot.png");
        ImageIO.write(image,"png", file);
        System.out.println("A screenshot is captured to " + file.getPath()); 
            }
}