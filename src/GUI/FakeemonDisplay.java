package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FakeemonDisplay extends JPanel {
    ImageIcon FakeemonPhoto;

    FakeemonDisplay(player pos){
        this.setLayout(new FlowLayout());
        this.setBounds(50,50,400,100);
        JProgressBar progressBar = new JProgressBar(0,120);
        progressBar.setValue(77);
        progressBar.setStringPainted(true);
        progressBar.setString("77/120");


        if(pos == player.first){
            this.add(progressBar);

        }

        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File("./images/fakeemon/aardart-front.png"));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            this.add(picLabel);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(pos == player.second){
            this.add(progressBar);

        }

    }


    enum player{
        first,
        second
    }
}
