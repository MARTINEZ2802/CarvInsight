
package sac.CarvInsight.util;


import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Imgs {
    
    public void Img2Label(JLabel NameLbl, String Nombre){
        ImageIcon image = new ImageIcon("src/img/"+Nombre+".png");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(NameLbl.getWidth(),NameLbl.getHeight(),Image.SCALE_DEFAULT));
        NameLbl.setIcon(icon);
    }
    
    public void Img2Btn (JButton namebtn, String Nombre){
        ImageIcon image = new ImageIcon("src/img/"+Nombre+".png");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(namebtn.getWidth(),namebtn.getHeight(),Image.SCALE_DEFAULT));
        namebtn.setIcon(icon); //
    }
    
}
