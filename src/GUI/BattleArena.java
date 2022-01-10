package GUI;

import javax.swing.*;
import java.awt.*;

public class BattleArena extends JPanel {
    BattleArena(){
        this.setLayout(new GridLayout(2,1));
        this.setBounds(0,20,400,200);
        this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        FakeemonDisplay player1 = new FakeemonDisplay(FakeemonDisplay.player.first);
        FakeemonDisplay player2 = new FakeemonDisplay(FakeemonDisplay.player.second);

        this.add(player1);
        this.add(player2);
    }
}
