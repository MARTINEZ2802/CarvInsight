
package sac.CarvInsight.util;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

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
    
    public void Img2TBtn (JToggleButton namebtn, String Nombre){
        ImageIcon image = new ImageIcon("src/img/"+Nombre+".png");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(namebtn.getWidth(),namebtn.getHeight(),Image.SCALE_DEFAULT));
        namebtn.setIcon(icon); //
    }
    
    public Image getIconImage (){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logo.png"));
       return retValue;
    
    }
    
}
