package javaapplication7;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.ImageIcon;

public class ball1 {

    Image img;
    public int x, xx;
    public int y, yy;
    public int count = 0;
    int c;
    
    ball1(int x, int y, int c) {
        this.x = x;
        this.y = y;
        this.c = c;
        String imageLocation = "a1.png";
        URL imageURL = this.getClass().getResource(imageLocation);
        img = Toolkit.getDefaultToolkit().getImage(imageURL);
        runner.start();
    }
    Thread runner = new Thread(new Runnable() {
        public void run() {
            while (true) {
                if (c == 1) {
                    x += 4;
                    y+=2;
                } else if (c == 2) {
                    y+=4;
                    x+=4;
                } else if (c == 3) {
                    y += 4;
                    x+=1;
                } else if (c == 4) {
                    y += 4;
                    x-=1;
                } else if (c == 5) {
                    x -= 4;
                    y+=4;
                } else if (c == 6) {
                    x -= 4;
                    y+=2;
                }
                if (x >= 1100) {
                    img = null;
                    runner = null;
                    x = -500;
                    y = -500;
                }
                try {
                    //runner.sleep(20);                // old code
                    runner.sleep(30);
                } catch (InterruptedException e) {
                }
            }
        }
    });

    public Image getImage() {
        return img;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Rectangle2D getbound() {
        return (new Rectangle2D.Double(x, y, 45, 45));
    }
}
