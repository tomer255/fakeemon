package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import Fakeemon.Fakeemon;

public class FakeemonDisplay extends JPanel {
    ImageIcon FakeemonPhoto;

    Fakeemon fakeemon;
    JProgressBar progressBar = new JProgressBar(0,0);

    FakeemonDisplay(playerLocation pos,Fakeemon fakeemon){
        this.setLayout(new FlowLayout());
        this.setBounds(0,0,400,100);
        this.setBackground(new Color(1.0f,1.0f,1.0f,0.25f));
        this.fakeemon = fakeemon;

        progressBar.setMaximum((int)fakeemon.getMaxHP());
        progressBar.setValue((int)fakeemon.getCurrentHP());
        progressBar.setStringPainted(true);
        progressBar.setString(String.format("%d/%d",(int)fakeemon.getCurrentHP(),(int)fakeemon.getMaxHP()));

        progressBar.setForeground(Color.RED);
//        TODO: Add the name of the fakeemon


        if(pos == playerLocation.first){
            this.add(progressBar);
        }

        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(getImage(fakeemon.getName(),pos));
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

     public void update(){
         progressBar.setMaximum((int)fakeemon.getMaxHP());
         progressBar.setValue((int)fakeemon.getCurrentHP());
         progressBar.setStringPainted(true);
         progressBar.setString(String.format("%d/%d",(int)fakeemon.getCurrentHP(),(int)fakeemon.getMaxHP()));

     }


    enum playerLocation {
        first,
        second
    }
}
