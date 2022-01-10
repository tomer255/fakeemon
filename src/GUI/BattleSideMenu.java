package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BattleSideMenu extends JPanel {
    BattleSideMenu(){
        this.setBounds(400,50,160,250);
        this.setLayout(new GridLayout(4,1,0,30));
        this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));

        JButton btnOpenAttackMenu = new JButton("Attack");
        JButton btnOpenBagMenu = new JButton("Open Bag");
        JButton btnChangeFakekemonMenu = new JButton("Change Fakekemon");
        JButton btnSurrender = new JButton("Surrender");

        this.add(btnOpenAttackMenu);
        this.add(btnOpenBagMenu);
        this.add(btnChangeFakekemonMenu);
        this.add(btnSurrender);
    }

//    public void paintComponent( Graphics g )
//    {
//        super.paintComponent( g );
//        Graphics2D g2d = (Graphics2D) g;
//        BufferedImage myPicture = null;
//        try {
//            myPicture = ImageIO.read(new File("./images/frame.jpg"));
//            g2d.drawImage(myPicture,0,0,null);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
