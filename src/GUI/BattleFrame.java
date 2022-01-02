package GUI;

import javax.swing.*;
import java.awt.*;

public class BattleFrame extends JFrame {
    public BattleFrame() {
        this.setTitle("fakekemon");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        ImageIcon icon = new ImageIcon("./images/Poké_Ball.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(250, 185, 0));
        this.setLayout(null);

        BattleSideMenu battleSideMenu = new BattleSideMenu();
        this.add(battleSideMenu);

//        GUI.FakeemonDisplay fakeemonDisplay = new GUI.FakeemonDisplay(GUI.FakeemonDisplay.player.first);
//        this.add(fakeemonDisplay);

        BattleArena battleArena = new BattleArena();
        this.add(battleArena);

        this.setSize(720, 480);

    }
}