package GUI;

import Fakeemon.Player;
import Item.Iitem;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.lang.Integer.max;

public class ItemMenu extends JPanel {

    ItemMenu() {
        this.setLayout(new GridLayout(1, 1, 0, 0));
        this.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
    }

    void setButtonsPanel(BattleFrame battleFrame) {
        this.removeAll();
        Player player = battleFrame.getCurrPlayer();
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setBackground(new Color(0.0f, 1.0f, 0.0f, 1.0f));
        int numberOfItems = player.getItems().size();
        int rows = max(numberOfItems / 2 + numberOfItems % 2, 3);
        buttonsPanel.setLayout(new GridLayout(rows, 2, 15, 15));

        for (Iitem item : player.getItems()) {
            CustomButton btnItem = new CustomButton(item.getName());
            btnItem.setIcon(getImage(item));
            btnItem.addActionListener((event) -> {
                        item.use(player.getFakeemon());
                        player.getItems().remove(item);
                        battleFrame.showFeedback();
                    }
            );
            btnItem.setToolTipText(item.getDescription());
            buttonsPanel.add(btnItem);
        }

        buttonsPanel.setPreferredSize(new Dimension(200, rows * 50));
        JScrollPane scrollFrame = new JScrollPane(buttonsPanel);
        scrollFrame.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        buttonsPanel.setAutoscrolls(true);
        scrollFrame.setPreferredSize(new Dimension(800, 300));
        this.add(scrollFrame);
    }

    private ImageIcon getImage(Iitem item) {
        ImageIcon icon = null;
        try {
            String path = String.format("./images/items/%s.png", item.getName());
            BufferedImage myPicture = ImageIO.read(new File(path));
            icon = new ImageIcon(myPicture);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return icon;
    }
}
