package com.example.fgs.designpattern.Decorator.Equipment;

import com.example.fgs.designpattern.Decorator.XEquip;

/***
 * 鞋子
 * 攻击力 5
 * @author zhy
 *
 */
public class ShoeEquip implements XEquip
{

    @Override
    public int caculateAttack()
    {
        return 5;
    }

    @Override
    public String description()
    {
        return "圣战靴子";
    }

}