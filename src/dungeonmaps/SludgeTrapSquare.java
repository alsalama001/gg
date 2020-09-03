/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Daria
 */
public class SludgeTrapSquare extends FloorTrapSquare{
    
    public SludgeTrapSquare(int r, int c) throws IOException {
        super(1, 10, r, c);
        this.message = "\nYou stepped into some sludge! You feel sluggish.";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//sludge.png")));
    } 
    
}
