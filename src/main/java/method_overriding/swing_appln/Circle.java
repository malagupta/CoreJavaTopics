package method_overriding.swing_appln;

import java.awt.*;

public class Circle {
    int radius = 0;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void draw(Graphics g, int x, int y) {
        g.drawOval(x - radius,
                   y - radius,
                   radius * 2,
                   radius * 2);
    }
}
