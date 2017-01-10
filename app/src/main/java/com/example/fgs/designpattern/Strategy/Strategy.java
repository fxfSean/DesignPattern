package com.example.fgs.designpattern.Strategy;

import android.content.Context;

/**
 * 策略：它定义了算法家庭，分别封装起来。让它们之间可以互相替换，此模式让算法的变化，不会影响到使用算法的客户。
 * Created by fgs on 2017/1/10.
 */
public interface Strategy {
    void ToastStrategy(Context context,String msg);
}
