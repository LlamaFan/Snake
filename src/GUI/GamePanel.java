package GUI;

import javax.swing.*;
import java.util.Timer;

public class GamePanel extends JPanel implements Runnable {
    private int[][] map;

    private boolean running;

    public GamePanel() {
        loadMap(50,50);
    }

    // Thread

    @Override
    public void run() {
        double lastTime = System.currentTimeMillis(); // Durch 100000
        double tick;

        while (running) {
            if (lastTime + 10000 >= System.currentTimeMillis()) {

            }
        }
    }

    // Helping methods

    private void loadMap(int x, int y) {
        map = new int[x][y];

        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++) map[i][j] = 0;
    }
}
