package com.hello.extend.view;

import com.hello.world.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.text.style.SuperscriptSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class MyExtendView extends View {

	private Paint mPaint;
	private Context mContext;
	private static final String mString = "Welcome to Mr Wei's blog";
	
	public MyExtendView(Context context) {
		super(context);
	}
	
	public MyExtendView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		
		mPaint = new Paint();  
        
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MyExtendView);  
          
        int textExtend = a.getColor(R.styleable.MyExtendView_textExtend, 0XFFFFFFFF);  
        float textSize = a.getDimension(R.styleable.MyExtendView_textSize, 36);  
          
        mPaint.setTextSize(textSize);  
        mPaint.setColor(textExtend);  
          
        a.recycle();  
        
	}

	
	
	@Override
	protected void onDraw(Canvas canvas) {
		
		super.onDraw(canvas);  
        
       // mPaint = new Paint();  
          
        //���û�����ɫ  
        mPaint.setColor(Color.RED);  
        //�������  
        mPaint.setStyle(Style.FILL);  
          
        //��һ������,ǰ�����Ǿ������Ͻ����꣬�������������½�����  
        canvas.drawRect(new Rect(10, 10, 100, 100), mPaint);  
          
        mPaint.setColor(Color.BLUE);  
        //��������  
        canvas.drawText(mString, 10, 110, mPaint);  
	}
}
