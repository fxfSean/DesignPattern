package com.example.fgs.designpattern.visitor;

//观察者模式
interface Visitor {
    //访问工程师类型
    void visit(Engineer engineer);
    //访问经理类型
    void visit(Manager manager);

}
