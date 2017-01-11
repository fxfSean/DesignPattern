package com.example.fgs.designpattern.Factory;

/**
 * 提供肉夹馍的原料
 * @author fxf
 *
 */
public interface RouJiaMoYLFactroy
{
    /**
     * 生产肉
     * @return
     */
    public Meat createMeat();

    /**
     * 生产调料神马的
     * @return
     */
    public YuanLiao createYuanliao();

}