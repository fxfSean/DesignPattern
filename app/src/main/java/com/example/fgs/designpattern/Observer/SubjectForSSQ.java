package com.example.fgs.designpattern.Observer;

import java.util.Observable;

/**
 * Created by fgs on 2017/1/10.
 */
public class SubjectForSSQ extends Observable {
    private String msg;
    public String getMsg(){
        return msg;
    }
    public void setMsg(String msg){
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
