package GUI;

import javax.swing.*;

public class Init extends JFrame {
    protected StartPanel startPanel;
    protected GamePanel gamePanel;
    protected ScorePanel scorePanel;

    public Init() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(121, 183, 60));
        setSize(200, 300);
        setResizable(false);
    }
}
