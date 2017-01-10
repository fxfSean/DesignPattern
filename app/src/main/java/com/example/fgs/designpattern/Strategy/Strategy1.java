package com.example.fgs.designpattern.Strategy;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by fgs on 2017/1/10.
 */
public class Strategy1 implements Strategy {
    @Override
    public void ToastStrategy(Context context,String msg) {
        Toast.makeText(context, "you choosed + " + msg, Toast.LENGTH_SHORT).show();
    }
}
