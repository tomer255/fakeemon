package GUI;

import javax.swing.*;
import java.awt.*;

public class BattleArena extends JPanel {

    FakeemonDisplay fakeemonDisplay1;
    FakeemonDisplay fakeemonDisplay2;

    BattleArena(BattleFrame battleFrame){
        this.setLayout(new GridLayout(2,1,15,15));
        this.setBounds(50,20,300,160);
        this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        fakeemonDisplay2 = new FakeemonDisplay(FakeemonDisplay.playerLocation.first,battleFrame.getEnemyPlayer());
        fakeemonDisplay1 = new FakeemonDisplay(FakeemonDisplay.playerLocation.second,battleFrame.getCurrPlayer());

        this.add(fakeemonDisplay2);
        this.add(fakeemonDisplay1);
    }

    public void updateDisplay(BattleFrame battleFrame){
        fakeemonDisplay1.updateDisplay(battleFrame.getCurrPlayer());
        fakeemonDisplay2.updateDisplay(battleFrame.getEnemyPlayer());
        battleFrame.repaint();
        battleFrame.revalidate();
    }
}
