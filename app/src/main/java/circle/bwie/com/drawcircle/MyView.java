package circle.bwie.com.drawcircle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by admina on 2016/11/5.
 */
public class MyView extends View{
    private float cx=500;
    private float cy=500;
    private float radius=200;
    private Paint paint=new Paint();

    public MyView(Context context) {
        super(context);
    }
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.GREEN);
        canvas.drawCircle(cx,cy,radius,paint);

            }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        cx=event.getX();
        cy=event.getY();
        radius++;
        if (radius==50){
            radius=10;
        }
        invalidate();
        return true;
    }
}
