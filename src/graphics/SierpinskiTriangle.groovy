package graphics

import javax.swing.JFrame
import java.awt.Canvas
import java.awt.Color
import java.awt.Graphics

/**
 * Created by Andrew Parker on 27/03/2016.
 */
class SierpinskiTriangle extends Canvas {

    // pair of variables which will store the "current" point
    int currentX = 512
    int currentY = 382

    /** Sets a WIDTH of 1024 and a HEIGHT of 768 for the Canvas.
     *  Opens canvas with frame as defined in paint()
     * @param args
     */
    static void main(def args) {
        JFrame frame = new JFrame()
        frame.setSize(1024, 768)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

        frame.add(new SierpinskiTriangle())
        frame.setVisible(true)
    }

    /** Challenge: Build in testing.
     *
     * @param g Graphics object used for drawing.
     */
    void paint(Graphics g) {
        /** (x1,y1), (x2,y2), and (x3,y3)
         x1 is half the width of the screen (512)
         y1 is 1/7 the height of the screen (109)
         x2 is 1/7 the width of the screen (146)
         y2 is 6/7 the height of the screen (654)
         x3 is 6/7 the width of the screen (876)
         y3 is 6/7 the height of the screen (again, 654)
         */
        int[] x = [512, 146, 876]
        int[] y = [109, 654, 654]

        for (int i = 0; i < 50000; i++) {
            g.drawLine(currentX, currentY, currentX, currentY)
            int r = random() // zero, one, or two.
            //  find the distance between (x,y) and (x[r],y[r])
            int xDistance = currentX - x[r]
            int yDistance = currentY - y[r]
            // Move the "current" point half the distance to the chosen vertex
            currentX = currentX - xDistance / 2
            currentY = currentY - yDistance / 2
            // change colour
            g.setColor(randomColour())
        }
        // The Sierpinski triangle is named after Waclaw Sierpinski, who described it in 1915
        g.drawString("Sierpinski Triangle", 462, 484)

    }


    Random rgen = new Random()
    /** Challenge: use metaclass to do this,
     * create random colour.
     */
    Color randomColour() {
        // number between 1 and 255
        int red = 1 + rgen.nextInt(255)
        int green = 1 + rgen.nextInt(255)
        int blue = 1 + rgen.nextInt(255)
        Color color = new Color(red, green, blue)
    }
    // create random number
    int random() {
        // number between 0 and 2
        int random = rgen.nextInt(3)
    }

}
