
package sac.CarvInsight.util;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Img {  
    
    private void SetImagenLabel(JLabel NameLbl, String ruta){
        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(NameLbl.getWidth(),NameLbl.getHeight(),Image.SCALE_DEFAULT));
        NameLbl.setIcon(icon);
        this.
    }    
}
