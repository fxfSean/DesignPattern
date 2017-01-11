package com.example.fgs.designpattern.Decorator;

/**
 * 装备的接口
 *
 * @author fxf
 *
 */
public interface XEquip
{

    /**
     * 计算攻击力
     *
     * @return
     */
    public int caculateAttack();

    /**
     * 装备的描述
     *
     * @return
     */
    public String description();
}