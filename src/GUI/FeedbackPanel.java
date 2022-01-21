package GUI;

import javax.swing.*;
import java.awt.*;

public class FeedbackPanel extends JPanel {
    private final JLabel feedbackLabel = new JLabel();
    private final CustomButton btnOk = new CustomButton("OK");

    public FeedbackPanel(BattleFrame battleFrame) {
        btnOk.addActionListener((event) -> battleFrame.endTurn()
        );
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));

        //feedbackLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        btnOk.setAlignmentX(CustomButton.CENTER_ALIGNMENT);
        btnOk.setPreferredSize(new Dimension(20, 20));

        this.add(feedbackLabel);
        this.add(btnOk);
    }

    public void setLabelText(String msg) {
        String htmlContent =  String.format("<html><p style=\"text-align:center\"><strong><span style=\"font-size:24px\"><span style=\"font-family:Comic Sans MS,cursive\">%s</span></span></strong>\uD83D\uDE00</p></html>",msg);
        feedbackLabel.setText(htmlContent);
    }

    public JButton getBtnOk() {
        return btnOk;
    }

}
