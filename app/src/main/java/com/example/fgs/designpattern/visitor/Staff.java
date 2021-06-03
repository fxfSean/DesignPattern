package com.example.fgs.designpattern.visitor;

import java.util.Random;

public abstract class Staff {
    public String name;

    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    //接受visitor访问
    public abstract void accept(Visitor visitor);
}
