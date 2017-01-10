package com.example.fgs.designpattern.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 当然了 XXXView.setOnXXXListener不一定是观察者模式，因为观察者模式是一种一对多的关系，对于setXXXListener是1对1的关系，应该叫回调
 * Created by fgs on 2017/1/10.
 */
public class Observer1 implements Observer {

    public void registerSubject(Observable observable)
    {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectFor3d){
            SubjectFor3d subjectFor3d = (SubjectFor3d)o;
            System.out.println("subjectFor3d just set msg -->" + subjectFor3d.getMsg());
        }
        if (o instanceof SubjectForSSQ){
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ)o;
            System.out.println("subjectForSSQ just set msg --> " + subjectForSSQ.getMsg());
        }
    }
}
