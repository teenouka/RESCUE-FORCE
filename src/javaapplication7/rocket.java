package javaapplication7;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class rocket{
    public ImageIcon[] im = new ImageIcon[7];
   
    
    public int x;
    public int count = 4;
    rocket(){
        for(int i=0;i<7;i++){
            im[i] = new ImageIcon(this.getClass().getResource((i+1)+".png"));
            
	}
      
    }


    
}
