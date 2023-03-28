package method_overriding.swing_appln;

import java.awt.*;
import java.util.Random;

public class ColoredCircle extends Circle{
    private Color color;

    public ColoredCircle(int radius) {
        super(radius);
        this.color = getRandomColor();
    }

    Color getRandomColor() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        return new Color(red, green, blue);
    }

    @Override
    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillOval(x - radius,
                   y - radius,
                   radius * 2,
                   radius * 2);

    }
}
