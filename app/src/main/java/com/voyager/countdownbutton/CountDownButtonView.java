package com.voyager.countdownbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by wuhaojie on 2015/7/23.
 */
public class CountDownButtonView extends Button {

    public CountDownButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs);
    }

    /**
     * 初始化视图
     */
    private void initView(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.CountDownButtonView);
        }
    }
}
