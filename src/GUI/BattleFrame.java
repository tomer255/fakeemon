package GUI;

import Fakeemon.*;
import Moves.Absorb;
import Moves.Move;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BattleFrame extends JFrame {

    private BattleSideMenu battleSideMenu;
    private BattleArena battleArena;
    private DynamicMenu dynamicMenu;

    private Player player1 = new Player();
    private Player player2 = new Player();

    public BattleFrame() {
        this.setTitle("fakeemon");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        ImageIcon icon = new ImageIcon("./images/Poké_Ball.png");
        this.setIconImage(icon.getImage());
        this.setSize(600, 400);

//        TypeBalance.

        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File("./images/grass-background.png"));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            this.setContentPane(picLabel);
        } catch (IOException e) {
            e.printStackTrace();
        }


        this.setLayout(null);

        List<Move> moves = new ArrayList<>();
        moves.add(new Absorb());
        moves.add(new Absorb());
        moves.add(new Absorb());
        moves.add(new Absorb());


        Fakeemon fakeemon2 = new Fakeemon("agnite", TypeBalance.Type.Fire, 125, 120,
                moves,3.4f,3.5f,3.5f,3f,5f);

        Fakeemon fakeemon1 = new Fakeemon("anoleaf", TypeBalance.Type.Water, 105, 77,
                moves,3.4f,3.5f,3.5f,3f,5f);

        player1.addFakeemon(fakeemon1);
        player2.addFakeemon(fakeemon2);

        battleSideMenu = new BattleSideMenu();
        battleArena = new BattleArena(fakeemon2,fakeemon1);
        dynamicMenu = new DynamicMenu();

        this.add(battleSideMenu);
        this.add(battleArena);
        this.add(dynamicMenu);

        setActionListeners();

        this.setVisible(true);
    }

    void setActionListeners(){
        setMoveActionListeners();
    }

    void setMoveActionListeners(){
        CustomButton ButtonAttackMenu = battleSideMenu.getButtonAttackMenu();
        BattleFrame battleFrame = this;

        Fakeemon fakeemon1 = player1.getFakeemon();
        Fakeemon fakeemon2 = player2.getFakeemon();
        ButtonAttackMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //---------------------------------
                dynamicMenu.removeAll();
                dynamicMenu.getMoveMenu().removeAll();
                for (Move move: fakeemon1.getAttackPool()) {
                    CustomButton btnMove = new CustomButton(move.getName());
                    btnMove.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            move.use(fakeemon1,fakeemon2);
                            battleArena.update();
                            btnMove.setText(move.getName());
                        }
                    });
                    dynamicMenu.getMoveMenu().add(btnMove);
                }
                dynamicMenu.add(dynamicMenu.getMoveMenu());
                //---------------------------------

                // refresh the panels
                battleFrame.repaint();
                battleFrame.revalidate();
            }
        });
    }
}