import javax.swing.*;
import java.awt.*;

public class Circle extends JPanel {

    Circle() {
        this.setPreferredSize(new Dimension(50, 50));
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(Color.cyan);
        g2d.setStroke(new BasicStroke(3));
        g2d.fillOval(0, 0, 50, 50);
    }

}
