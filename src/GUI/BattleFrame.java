package GUI;

import Fakeemon.*;
import Item.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BattleFrame extends JFrame {

    private final BattleSideMenu battleSideMenu;
    private final BattleArena battleArena;
    private final DynamicMenu dynamicMenu;

    private Player currPlayer = new Player();
    private Player enemyPlayer = new Player();

    public BattleFrame() {
        this.setTitle("fakeemon");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        ImageIcon icon = new ImageIcon("./images/Poké_Ball.png");
        this.setIconImage(icon.getImage());
        this.setSize(600, 400);

        BufferedImage myPicture;
        try {
            myPicture = ImageIO.read(new File("./images/grass-background.png"));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            this.setContentPane(picLabel);
        } catch (IOException e) {
            e.printStackTrace();
        }


        this.setLayout(null);

        battleInitialization();


        battleSideMenu = new BattleSideMenu();
        battleArena = new BattleArena(this);
        dynamicMenu = new DynamicMenu(this);

        this.add(battleSideMenu);
        this.add(battleArena);
        this.add(dynamicMenu);

        setActionListeners();

        this.setVisible(true);
    }

    private void battleInitialization(){
        for (Fakeemon fakeemon : FakeemonGenerator.generateFakeemonsList(3)){
            currPlayer.addFakeemon(fakeemon);
        }

        for (Fakeemon fakeemon : FakeemonGenerator.generateFakeemonsList(3)){
            enemyPlayer.addFakeemon(fakeemon);
        }

        for (Iitem item : ItemsListGenerator.generateItemsList(5)){
            currPlayer.addItem(item);
        }

        for (Iitem item : ItemsListGenerator.generateItemsList(5)){
            enemyPlayer.addItem(item);
        }


    }

    public BattleArena getBattleArena() {
        return battleArena;
    }

    public DynamicMenu getDynamicMenu() {
        return dynamicMenu;
    }

    public BattleSideMenu getBattleSideMenu() {
        return battleSideMenu;
    }

    public Player getCurrPlayer() {
        return currPlayer;
    }

    public Player getEnemyPlayer() {
        return enemyPlayer;
    }

    public void showFeedback(String massage) {
        dynamicMenu.removeAll();
        FeedbackPanel feedbackPanel = dynamicMenu.getFeedbackPanel();
        feedbackPanel.setLabelText(massage);
        battleSideMenu.setEnabledButtons(false);
        dynamicMenu.add(feedbackPanel);

        battleArena.updateDisplay(this);
    }

    public void endTurn(){
        swapPlayers();
        dynamicMenu.removeAll();
        battleSideMenu.setEnabledButtons(true);
        if (currPlayer.getFakeemon().getCurrentHP() == 0){
            battleSideMenu.btnChangeFakekemonMenu.doClick();
            System.out.printf("test: %s",currPlayer.getFakeemon().getCurrentHP());
            battleSideMenu.setEnabledButtons(false);
        }
        battleArena.updateDisplay(this);
    }

    private void swapPlayers(){
        Player temp = currPlayer;
        currPlayer = enemyPlayer;
        enemyPlayer = temp;
    }

    void setActionListeners() {
        setMoveActionListeners();
        setItemActionListeners();
        setChangeFakeemonActionListeners();
    }

    void setItemActionListeners() {
        CustomButton ButtonOpenBagMenu = battleSideMenu.getBtnOpenBagMenu();
        BattleFrame battleFrame = this;

        ButtonOpenBagMenu.addActionListener((event) -> {
                    dynamicMenu.removeAll();
                    ItemMenu itemMenu = dynamicMenu.getItemMenu();
                    itemMenu.setButtonsPanel(battleFrame);
                    dynamicMenu.add(itemMenu);

                    // refresh the panels
                    battleFrame.repaint();
                    battleFrame.revalidate();
                }
        );
    }


    void setMoveActionListeners() {
        CustomButton buttonAttackMenu = battleSideMenu.getButtonAttackMenu();
        BattleFrame battleFrame = this;

        buttonAttackMenu.addActionListener((event) -> {
                    dynamicMenu.removeAll();
                    MoveMenu moveMenu = dynamicMenu.getMoveMenu();
                    moveMenu.setButtonsPanel(battleFrame);
                    dynamicMenu.add(dynamicMenu.getMoveMenu());

                    // refresh the panels
                    battleFrame.repaint();
                    battleFrame.revalidate();
                }
        );
    }

    void setChangeFakeemonActionListeners() {
        CustomButton ButtonChangeFakeemonMenu = battleSideMenu.getBtnChangeFakekemonMenu();
        BattleFrame battleFrame = this;

        ButtonChangeFakeemonMenu.addActionListener((event) -> {
                    dynamicMenu.removeAll();
                    ChangeFakeemonMenu changeFakeemonMenu = dynamicMenu.getCahngeFakeemonMenu();
                    changeFakeemonMenu.setButtonsPanel(battleFrame);
                    dynamicMenu.add(changeFakeemonMenu);

                    // refresh the panels
                    battleFrame.repaint();
                    battleFrame.revalidate();
                }
        );
    }
}