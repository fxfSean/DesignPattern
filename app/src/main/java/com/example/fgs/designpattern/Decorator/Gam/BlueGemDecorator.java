package com.example.fgs.designpattern.Decorator.Gam;


import com.example.fgs.designpattern.Decorator.XEquip;
import com.example.fgs.designpattern.Decorator.XEquipDecorator;

/**
 * 蓝宝石装饰品
 * 每颗攻击力+5
 * @author fxf
 *
 */
public class BlueGemDecorator implements XEquipDecorator
{
    /**
     * 每个装饰品维护一个装备
     */
    private XEquip equip;

    public BlueGemDecorator(XEquip equip)
    {
        this.equip = equip;
    }

    @Override
    public int caculateAttack()
    {
        return 5 + equip.caculateAttack();
    }

    @Override
    public String description()
    {
        return equip.description() + "+ 蓝宝石";
    }

}