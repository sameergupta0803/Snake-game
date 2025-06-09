import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {


    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake");
        Image icon = new ImageIcon(this.getClass().getResource("snakegame.png")).getImage();
        this.setIconImage(icon);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
