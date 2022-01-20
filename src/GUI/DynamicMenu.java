package GUI;

import javax.swing.*;
import java.awt.*;

public class DynamicMenu extends JPanel {
    MoveMenu moveMenu;
    ItemMenu itemMenu;
    FeedbackPanel feedbackPanel;
    ChangeFakeemonMenu cahngeFakeemonMenu;


    DynamicMenu(BattleFrame battleFrame){
        this.setBounds(50,200,300,150);
        this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
//        this.setLayout(null);// TODO: set Layout
        this.setLayout(new BorderLayout());
        moveMenu = new MoveMenu();
        itemMenu = new ItemMenu();
        feedbackPanel = new FeedbackPanel(battleFrame);
        cahngeFakeemonMenu = new ChangeFakeemonMenu();
    }

    public MoveMenu getMoveMenu() {
        return moveMenu;
    }

    public ItemMenu getItemMenu() {
        return itemMenu;
    }

    public FeedbackPanel getFeedbackPanel()
    {
        return feedbackPanel;
    }

    public ChangeFakeemonMenu getCahngeFakeemonMenu()
    {
        return cahngeFakeemonMenu;
    }
}
