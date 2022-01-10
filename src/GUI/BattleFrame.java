package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BattleFrame extends JFrame {
    public BattleFrame() {
        this.setTitle("fakekemon");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        ImageIcon icon = new ImageIcon("./images/Poké_Ball.png");
        this.setIconImage(icon.getImage());

        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File("./images/grass-background.png"));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            this.setContentPane(picLabel);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.setLayout(null);

        BattleSideMenu battleSideMenu = new BattleSideMenu();
        this.add(battleSideMenu);

        BattleArena battleArena = new BattleArena();
        this.add(battleArena);

        this.setSize(600, 420);

    }
}