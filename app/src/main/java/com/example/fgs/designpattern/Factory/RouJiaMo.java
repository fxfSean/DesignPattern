package com.example.fgs.designpattern.Factory;

/**
 * 抽象肉夹馍
 * 所有口味肉价馍的父亲
 * Created by fgs on 2017/1/10.
 */

public abstract class RouJiaMo
{
    public String name;

    /**
     * 准备工作
     */
    public void prepare(RouJiaMoYLFactroy ylFactroy)
    {
//        System.out.println("揉面-剁肉-完成准备工作");
        Meat meat = ylFactroy.createMeat();
        YuanLiao yuanliao = ylFactroy.createYuanliao();
        System.out.println("使用官方的原料" + meat + " , " + yuanliao + "作为原材料制作肉夹馍 ");
    }

    /**
     * 使用你们的专用袋-包装
     */
    public void pack()
    {
        System.out.println("肉夹馍-专用袋-包装");
    }
    /**
     * 秘制设备-烘烤2分钟
     */
    public void fire()
    {
        System.out.println("肉夹馍-专用设备-烘烤");
    }
}