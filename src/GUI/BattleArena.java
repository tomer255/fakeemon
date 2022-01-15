package GUI;

import javax.swing.*;
import java.awt.*;
import Fakeemon.Fakeemon;

public class BattleArena extends JPanel {

    FakeemonDisplay fakeemonDisplay1;
    FakeemonDisplay fakeemonDisplay2;

    BattleArena(Fakeemon firstFakeemon,Fakeemon secondFakeemon){
        this.setLayout(new GridLayout(2,1,15,15));
        this.setBounds(50,20,300,160);
        this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        fakeemonDisplay1 = new FakeemonDisplay(FakeemonDisplay.playerLocation.first,firstFakeemon);
        fakeemonDisplay2 = new FakeemonDisplay(FakeemonDisplay.playerLocation.second,secondFakeemon);

        this.add(fakeemonDisplay1);
        this.add(fakeemonDisplay2);
    }

    public void update(){
        fakeemonDisplay1 .update();
        fakeemonDisplay2.update();
    }
}
