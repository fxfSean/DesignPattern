package com.example.fgs.designpattern.visitor;

//不使用Visitor方式
@Deprecated()
class ReportUtil {
    public static void visit(Staff staff){
        if (staff instanceof Manager){
            Manager mgr = (Manager)staff;
            //todo visit mgr
        } else if (staff instanceof Engineer){
            Engineer engineer = (Engineer)staff;
            //todo visit engineer
        }
    }
}
