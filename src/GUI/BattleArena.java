package GUI;

import javax.swing.*;
import java.awt.*;

public class BattleArena extends JPanel {
    BattleArena(){
        this.setLayout(new GridLayout(2,1));
        this.setBounds(0,20,400,200);
        this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        FakeemonDisplay fakeemonDisplay1 = new FakeemonDisplay(FakeemonDisplay.playerLocation.first);
        FakeemonDisplay fakeemonDisplay2 = new FakeemonDisplay(FakeemonDisplay.playerLocation.second);

        this.add(fakeemonDisplay1);
        this.add(fakeemonDisplay2);
    }
}
