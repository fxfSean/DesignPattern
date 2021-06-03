package com.example.fgs.designpattern.visitor;

import java.util.Random;

class Engineer extends Staff{
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines(){
        return new Random().nextInt(1000);
    }
}
