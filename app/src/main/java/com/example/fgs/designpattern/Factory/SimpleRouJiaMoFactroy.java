package com.example.fgs.designpattern.Factory;

/**
 * 简单工厂模式，只关心造肉夹馍
 * Created by fgs on 2017/1/10.
 */
public class SimpleRouJiaMoFactroy {
    public RouJiaMo createRouJiaMo(String type)
    {
        RouJiaMo rouJiaMo = null;
        if (type.equals("Suan"))
        {
            rouJiaMo = new SuanRouJiaMo();

        } else if (type.equals("Tian"))
        {
            rouJiaMo = new TianRouJiaMo();
        } else if (type.equals("La"))
        {
            rouJiaMo = new LaRouJiaMo();
        }
        return rouJiaMo;
    }
}
