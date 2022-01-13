package GUI;

import javax.swing.*;
import java.awt.*;

public class MoveMenu extends JPanel {
    MoveMenu(){
        this.setLayout(new GridLayout(2,2,15,15));
        this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));

        CustomButton btnA = new CustomButton("A");
        CustomButton btnB = new CustomButton("B");
        CustomButton btnC = new CustomButton("C");
        CustomButton btnD = new CustomButton("D");

        this.add(btnA);
        this.add(btnB);
        this.add(btnC);
        this.add(btnD);
    }
}
