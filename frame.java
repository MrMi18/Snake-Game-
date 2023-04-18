import javax.swing.JFrame;
import java.awt.*;

public class frame extends JFrame{
    frame(){
        this.setTitle("SnakeGame");
        this.add(new Panel());
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
    }
}
