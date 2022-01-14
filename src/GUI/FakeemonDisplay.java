package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FakeemonDisplay extends JPanel {
    ImageIcon FakeemonPhoto;

    FakeemonDisplay(playerLocation pos){
        this.setLayout(new FlowLayout());
        this.setBounds(0,0,400,100);
        this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        JProgressBar progressBar = new JProgressBar(0,120);
        progressBar.setValue(77);
        progressBar.setStringPainted(true);
        progressBar.setString("77/120");
        progressBar.setForeground(Color.RED);


        if(pos == playerLocation.first){
            this.add(progressBar);
        }

        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(getImage("bamboon",pos));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            this.add(picLabel);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(pos == playerLocation.second){
            this.add(progressBar);
        }

    }

    private File getImage(String fakeemonName , playerLocation pos){
        String loc = "";
        if(pos == playerLocation.first){
            loc = "front";
        }
        else {
            loc = "back";
        }
        String sf=String.format("./images/fakeemon/%s-%s.png",fakeemonName,loc);
        return new File(sf);
    }


    enum playerLocation {
        first,
        second
    }
}
