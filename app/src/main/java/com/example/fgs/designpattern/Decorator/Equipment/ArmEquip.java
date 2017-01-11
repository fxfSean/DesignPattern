package com.example.fgs.designpattern.Decorator.Equipment;

import com.example.fgs.designpattern.Decorator.XEquip;

/**
 * * 武器
 * 攻击力20
 * Created by fgs on 2017/1/10.
 */
public class ArmEquip implements XEquip {
    @Override
    public int caculateAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "屠龙刀";
    }
}
