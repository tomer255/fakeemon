package GUI;

import javax.swing.*;
import java.awt.*;

public class DynamicMenu extends JPanel {
    DynamicMenu(){
        this.setBounds(50,200,300,150);
        this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
//        this.setLayout(null);// TODO: set Layout
        this.setLayout(new GridLayout(1,1,0,0));
    }

    public void showMoveMenu(){
        this.removeAll();
        MoveMenu moveMenu = new MoveMenu();
        this.add(moveMenu);
    }
}
