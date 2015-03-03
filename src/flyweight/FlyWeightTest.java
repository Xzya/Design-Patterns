package flyweight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlyWeightTest extends JFrame {

    JButton startDrawing;

    int windowWidth = 1280;
    int windowHeight = 720;

    Random randomGenerator = new Random();

    Color[] shapeColor = {
            Color.orange,
            Color.red,
            Color.yellow,
            Color.blue,
            Color.pink,
            Color.cyan,
            Color.magenta,
            Color.black,
            Color.gray
    };

    public static void main(String[] args) {
        new FlyWeightTest(1000000);
    }

    public FlyWeightTest(int iterations) {
        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("FlyWeight Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();
        startDrawing = new JButton("Draw Stuff");

        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = drawingPanel.getGraphics();

                long startTime = System.currentTimeMillis();

                for (int i = 0; i < iterations; ++i) {

                    //                                        MyRect rect = new MyRect(getRandColor(), getRandX(), getRandY(), getRandX(), getRandY());
                    //                                        rect.draw(g);

                    MyRect rect = RectFactory.getRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());

                }

                long endTime = System.currentTimeMillis();

                System.out.println("That took " + (endTime - startTime));
            }
        });

        this.add(contentPane);
        this.setVisible(true);
    }

    private Color getRandColor() {
        int randInt = randomGenerator.nextInt(shapeColor.length);
        return shapeColor[randInt];
    }

    private int getRandX() {
        return (int) (randomGenerator.nextDouble() * windowWidth);
    }

    private int getRandY() {
        return (int) (randomGenerator.nextDouble() * windowHeight);
    }

}
