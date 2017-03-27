package id.co.noz.usecaseview;

import android.graphics.Point;
import android.view.View;

import id.co.noz.usecaseview.view1.MaterialShowcaseView;

/**
 * Created by CLient-PC on 25/03/2017.
 */

public interface IAnimationFactory {

    void fadeInView(View target, long duration, AnimationStartListener listener);

    void fadeOutView(View target, long duration, AnimationEndListener listener);

    void animateTargetToPoint(MaterialShowcaseView showcaseView, Point point);

    public interface AnimationStartListener {
        void onAnimationStart();
    }

    public interface AnimationEndListener {
        void onAnimationEnd();
    }
}

