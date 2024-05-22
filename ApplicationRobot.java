import java.awt.*;
import java.awt.event.InputEvent;
public class ApplicationRobot{
    public static void main(String[] args) throws Exception {
        Robot oscar = new Robot();
        oscar.mouseMove(875,5);
        int color = getPixelColor(oscar);
        oscar.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        oscar.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    }

    private static int getPixelColor(Robot oscar) {
        return getPixelColor(oscar);
        System.out.println("Color is " + color);
    }
}