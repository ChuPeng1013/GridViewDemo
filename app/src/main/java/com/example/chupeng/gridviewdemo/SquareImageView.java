package com.example.chupeng.gridviewdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by ChuPeng on 2017/2/25.
 */

public class SquareImageView extends ImageView
{

    public SquareImageView(Context context)
    {
        super(context);
    }

    public SquareImageView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public SquareImageView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        //将宽和高设置为一样的
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
