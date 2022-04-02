package Main.Graficos;

import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame{

    Panel panel;
    // Constructor
    public Frame(){
        panel = new Panel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1600,800);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
