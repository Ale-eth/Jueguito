package Main.Graficos;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Image bg;

    Panel(){
        bg = new ImageIcon("bg.jpg").getImage();
        this.setPreferredSize(new Dimension(1600, 800));
    }

    public void paint(Graphics graficos){
        Graphics2D graficos2D = (Graphics2D) graficos;

        graficos2D.drawImage(bg,0 ,0 ,null);
    }
}
