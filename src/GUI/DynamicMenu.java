package GUI;

import javax.swing.*;
import java.awt.*;

public class DynamicMenu extends JPanel {
    MoveMenu moveMenu = new MoveMenu();

    DynamicMenu(){
        this.setBounds(50,200,300,150);
        this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
//        this.setLayout(null);// TODO: set Layout
        this.setLayout(new GridLayout(1,1,0,0));
    }

    public MoveMenu getMoveMenu() {
        return moveMenu;
    }
}
