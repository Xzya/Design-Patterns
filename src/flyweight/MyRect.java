package flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class MyRect {

    private Color color;
    private int x, y, x2, y2;

    public MyRect(Color _color) {
        color = _color;
    }

    public void draw(Graphics g, int _upperX, int _upperY, int _lowerX, int _lowerY) {
        g.setColor(color);
        g.fillRect(_upperX, _upperY, _lowerX, _lowerY);
    }

    //    /*
    public MyRect(Color _color, int _upperX, int _upperY, int _lowerX, int _lowerY) {
        color = _color;
        x = _upperX;
        y = _upperY;
        x2 = _lowerX;
        y2 = _lowerY;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, x2, y2);
    }
    //    */

}
