package method_overriding.swing_appln;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DrawingApp extends JFrame {
    private JRadioButton plainCircleButton;
    private JRadioButton coloredCircleButton;
    private JPanel canvas;

    public DrawingApp() {
        initAppFrame();
        initiateRadioButtons();
        createRadioButtonGroup();
        createCanvasPanel();

        addMouseListenerToCanvasPanel();
        AddComponentsToFrame();

        setPlainCircleAsDefaultSelection();
        showFrame();
    }

    private void addMouseListenerToCanvasPanel() {
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                int x = e.getX();
                int y = e.getY();
                Graphics g = canvas.getGraphics();

                if (plainCircleButton.isSelected()) {
                    drawCircle(g, x, y, new Circle(getRandomRadius()));
                } else {
                    drawCircle(g, x, y, new ColoredCircle(getRandomRadius()));
                }
            }
        });
    }

    private void drawCircle(Graphics g, int x, int y, Circle circle) {
        circle.draw(g, x, y);
    }

    private void showFrame() {
        setVisible(true);
    }

    private void setPlainCircleAsDefaultSelection() {
        plainCircleButton.setSelected(true);
    }

    private void AddComponentsToFrame() {
        JPanel radioPanel = new JPanel();
        radioPanel.add(plainCircleButton);
        radioPanel.add(coloredCircleButton);
        add(radioPanel, "North");
        add(canvas, "Center");
    }

    private void createCanvasPanel() {
        canvas = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
            }
        };
    }

    private void createRadioButtonGroup() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(plainCircleButton);
        buttonGroup.add(coloredCircleButton);
    }

    private void initiateRadioButtons() {
        plainCircleButton = new JRadioButton("Plain Circle");
        coloredCircleButton = new JRadioButton("Colored Circle");
    }

    private int getRandomRadius() {
        final var random = new Random();
        return random.nextInt(10, 50);
    }

    private void initAppFrame() {
        setTitle("Drawing App");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DrawingApp();
    }
}
