package com.example.fgs.designpattern.SingleTon;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by fgs on 2017/1/10.
 */
public class Singleton {

    /**
     * 线程安全双重锁定(Double-Check Locking)
     */
    private static Singleton singleton;
    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public void ShowToast(Context context){
        Toast.makeText(context, "您点击了单例模式", Toast.LENGTH_SHORT).show();
    }

}
