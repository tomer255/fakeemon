package GUI;

import Fakeemon.Player;
import Moves.Move;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoveMenu extends JPanel {

    MoveMenu(){
        this.setLayout(new GridLayout(2,2,15,15));
        this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
    }

    public void setButtonsPanel(BattleFrame battleFrame){
        this.removeAll();
        Player player1 = battleFrame.getCurrPlayer();
        Player player2 = battleFrame.getEnemyPlayer();
        for (Move move: player1.getFakeemon().getAttackPool()) {
            CustomButton btnMove = new CustomButton(move.getName());
            btnMove.addActionListener((event) -> {
                    move.use(player1.getFakeemon(),player2.getFakeemon());
                    btnMove.setText(move.getName());
                    battleFrame.showFeedback();
                }
            );
            btnMove.setToolTipText(move.getDescription());
            this.add(btnMove);
        }
    }
}
