package id.co.noz.usecaseview.shape;

import android.graphics.Canvas;
import android.graphics.Paint;

import id.co.noz.usecaseview.target.Target;

/**
 * Created by CLient-PC on 25/03/2017.
 */

public interface Shape {

    /**
     * Draw shape on the canvas with the center at (x, y) using Paint object provided.
     */
    void draw(Canvas canvas, Paint paint, int x, int y, int padding);

    /**
     * Get width of the shape.
     */
    int getWidth();

    /**
     * Get height of the shape.
     */
    int getHeight();

    /**
     * Update shape bounds if necessary
     */
    void updateTarget(Target target);
}
