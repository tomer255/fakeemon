package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import Fakeemon.*;

public class FakeemonDisplay extends JPanel {
    JProgressBar progressBar = new JProgressBar(0, 0);
    JPanel info = new JPanel();
    JLabel fakeemonName = new JLabel();
    JLabel picLabel = new JLabel();
    playerLocation pos;

    FakeemonDisplay(playerLocation pos, Player player) {
        Fakeemon fakeemon = player.getFakeemon();
        this.setLayout(new FlowLayout());
        this.setSize(400, 100);
        this.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.25f));
//        progressBar.setSize(new Dimension(10, 100));
        progressBar.setForeground(Color.RED);
        progressBar.setBackground(Color.PINK);
        this.pos = pos;
        info.setLayout(new GridLayout(3, 1, 1, 1));
        info.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        info.add(fakeemonName);
        info.add(progressBar);
//        info.add(new JLabel("test"));

        fakeemonName.setForeground(Color.WHITE);

        if (pos == playerLocation.first) {
            this.add(info);
        }

        this.add(picLabel);

        if (pos == playerLocation.second) {
            this.add(info);
        }

        updateDisplay(player);
    }

    private ImageIcon getImage(String fakeemonName, playerLocation pos) {
        String loc;
        if (pos == playerLocation.first) {
            loc = "front";
        } else {
            loc = "back";
        }

        String sf = String.format("./images/fakeemon/%s-%s.png", fakeemonName, loc);
        ImageIcon icon = null;
        try {
            BufferedImage myPicture = ImageIO.read(new File(sf));
            icon = new ImageIcon(myPicture);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return icon;
    }

    public void updateDisplay(Player player) {
        Fakeemon fakeemon = player.getFakeemon();
        progressBar.setMaximum((int) fakeemon.getMaxHP());
        progressBar.setValue((int) fakeemon.getCurrentHP());
        progressBar.setStringPainted(true);
        progressBar.setString(String.format("%d/%d", (int) fakeemon.getCurrentHP(), (int) fakeemon.getMaxHP()));
        fakeemonName.setText(fakeemon.getName());
        picLabel.setIcon(getImage(fakeemon.getName(), pos));
    }


    enum playerLocation {
        first,
        second
    }
}
