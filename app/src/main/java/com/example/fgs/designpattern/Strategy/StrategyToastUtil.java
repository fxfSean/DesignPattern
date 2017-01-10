package com.example.fgs.designpattern.Strategy;

import android.content.Context;

/**
 * Created by fgs on 2017/1/10.
 */
public class StrategyToastUtil {
    public void ToastStrategy(Context context,String msg,Strategy strategy){
        strategy.ToastStrategy(context,msg);
    }
}
