package com.example.fgs.designpattern.visitor;

import java.util.LinkedList;
import java.util.List;

//员工业务报表1类
class BusinessReport {
    List<Staff> mStaffs = new LinkedList<>();

    public BusinessReport() {
        mStaffs.add(new Manager("王经理"));
        mStaffs.add(new Engineer("工程师-wang"));
        mStaffs.add(new Engineer("工程师-li"));
        mStaffs.add(new Engineer("工程师-fu"));
        mStaffs.add(new Engineer("工程师-zhang"));
    }

    /**
     * 为访问者展示报表
     * @param visitor 公司高层如CEO、CTO
     */
    public void showReport(Visitor visitor){
        for (Staff staff : mStaffs) {
            staff.accept(visitor);
        }
    }
}
