package GUI;

import Fakeemon.Fakeemon;
import Fakeemon.Player;

import javax.swing.*;
import java.awt.*;

public class ChangeFakeemonMenu extends JPanel {


    ChangeFakeemonMenu() {
        this.setLayout(new GridLayout(2, 2, 15, 15));
        this.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
    }

    void setButtonsPanel(BattleFrame battleFrame) {
        this.removeAll();
        Player player = battleFrame.getCurrPlayer();

        for (Fakeemon fakeemon : player.getFakeemons()) {
            if (fakeemon != player.getFakeemon()) {
                CustomButton btnChangeFakeemon = new CustomButton(fakeemon.getName());
                if(fakeemon.getCurrentHP() == 0){
                    btnChangeFakeemon.setEnabled(false);
                }
                btnChangeFakeemon.addActionListener((event) -> {
                            String massage = String.format("you switch fakeemon from %s to %s", player.getFakeemon().getName(), fakeemon.getName());
                            player.setCurrentFakeemon(fakeemon);
                            battleFrame.showFeedback(massage);
                        }
                );
                btnChangeFakeemon.setToolTipText(fakeemon.getDescription());
                this.add(btnChangeFakeemon);
            }
        }
    }
}