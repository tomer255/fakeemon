package GUI;

import javax.swing.*;
import java.awt.*;

public class BattleSideMenu extends JPanel {
    BattleSideMenu(){
        this.setBounds(520,0,200,450);
        this.setLayout(new GridLayout(4,1));

        JButton btnOpenAttackMenu = new JButton("Attack");
        JButton btnOpenBagMenu = new JButton("Open Bag");
        JButton btnChangeFakekemonMenu = new JButton("Change Fakekemon");
        JButton btnSurrender = new JButton("Surrender");


        this.add(btnOpenAttackMenu);
        this.add(btnOpenBagMenu);
        this.add(btnChangeFakekemonMenu);
        this.add(btnSurrender);
    }
}
