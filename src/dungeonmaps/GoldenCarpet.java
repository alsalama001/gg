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
 * @author SP20CIS182
 */
public class GoldenCarpet extends MapSquare{
    public GoldenCarpet(int r, int c) throws IOException {
        super(new ImageIcon(ImageIO.read(new File("img//goldCarpet.png"))), r, c, true);
        this.message = "Oh too bad, its just a carpet.";
    }
}
