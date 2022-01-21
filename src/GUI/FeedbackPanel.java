package GUI;

import javax.swing.*;
import java.awt.*;

public class FeedbackPanel extends JPanel {
    private final JLabel feedbackLabel = new JLabel();

    public FeedbackPanel(BattleFrame battleFrame) {
        this.setLayout(null);
        this.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.25f));
        feedbackLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
//        feedbackLabel.setForeground(Color.WHITE);
        feedbackLabel.setBounds(5, -50, 300, 150);
        CustomButton btnOk = new CustomButton("OK");
        btnOk.setBounds(200, 100, 80, 40);
        btnOk.addActionListener((event) -> battleFrame.endTurn());
        this.add(feedbackLabel);
        this.add(btnOk);
    }

    public void setLabelText(String msg) {
        feedbackLabel.setText(msg);
    }
}
