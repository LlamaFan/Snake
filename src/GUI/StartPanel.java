package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanel extends JPanel {
    private int sizeX;
    private int sizeY;

    private JLabel title;
    private JButton start;
    private JButton leave;

    public StartPanel() {
        setPreferredSize(new Dimension(sizeX, sizeY));

        // Init of the UI objects

        initObj();

        // Action listeners for the buttons

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        leave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void initObj() {

    }
}
