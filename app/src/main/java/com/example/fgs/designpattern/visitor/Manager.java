package com.example.fgs.designpattern.visitor;

class Manager extends Staff {
    private int products;

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProducts() {
        return products;
    }
}
