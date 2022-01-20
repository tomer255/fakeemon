package GUI;

import javax.swing.*;
import java.awt.*;

public class BattleSideMenu extends JPanel {

    CustomButton btnOpenAttackMenu;
    CustomButton btnOpenBagMenu;
    CustomButton btnChangeFakekemonMenu;
    CustomButton btnSurrender;

    BattleSideMenu() {
        this.setBounds(400, 50, 160, 250);
        this.setLayout(new GridLayout(4, 1, 0, 30));
        this.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));

        btnOpenAttackMenu = new CustomButton("Attack");
        btnOpenBagMenu = new CustomButton("Open Bag");
        btnChangeFakekemonMenu = new CustomButton("Change Fakeemon");
        btnSurrender = new CustomButton("Surrender");

        this.add(btnOpenAttackMenu);
        this.add(btnOpenBagMenu);
        this.add(btnChangeFakekemonMenu);
        this.add(btnSurrender);
    }

    public CustomButton getBtnOpenBagMenu() {
        return btnOpenBagMenu;
    }

    public CustomButton getButtonAttackMenu() {
        return btnOpenAttackMenu;
    }

    public CustomButton getBtnChangeFakekemonMenu() {
        return btnChangeFakekemonMenu;
    }

    public void setEnabledButtons(boolean flag) {
        btnOpenAttackMenu.setEnabled(flag);
        btnOpenBagMenu.setEnabled(flag);
        btnChangeFakekemonMenu.setEnabled(flag);
        btnSurrender.setEnabled(flag);
    }
}
