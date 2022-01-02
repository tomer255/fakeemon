package GUI;

import javax.swing.*;
import java.awt.*;

public class BattleArena extends JPanel {
    BattleArena(){
        this.setLayout(new GridLayout(2,1));
        this.setBounds(50,50,400,200);
        FakeemonDisplay player1 = new FakeemonDisplay(FakeemonDisplay.player.first);
        FakeemonDisplay player2 = new FakeemonDisplay(FakeemonDisplay.player.second);

        this.add(player1);
        this.add(player2);
    }
}
