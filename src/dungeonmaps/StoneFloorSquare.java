/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author SP20CIS182
 */
public class StoneFloorSquare extends MapSquare{
    
    public StoneFloorSquare(int r, int c) throws IOException {
        super(new ImageIcon(ImageIO.read(new File("img//floor_sm.png"))), r, c, true);
        
    }
    
}
