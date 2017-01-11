package com.example.fgs.designpattern.Decorator.Equipment;

import com.example.fgs.designpattern.Decorator.XEquip;

/**
 * 戒指
 * 攻击力 5
 * @author fxf
 *
 */
public class RingEquip implements XEquip
{

    @Override
    public int caculateAttack()
    {
        return 5;
    }

    @Override
    public String description()
    {
        return "圣战戒指";
    }

}
