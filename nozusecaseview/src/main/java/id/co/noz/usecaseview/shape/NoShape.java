package id.co.noz.usecaseview.shape;

import android.graphics.Canvas;
import android.graphics.Paint;

import id.co.noz.usecaseview.target.Target;

/**
 * Created by CLient-PC on 25/03/2017.
 */

public class NoShape implements Shape {

    @Override
    public void updateTarget(Target target) {
        // do nothing
    }

    @Override
    public void draw(Canvas canvas, Paint paint, int x, int y, int padding) {
        // do nothing
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
