package com.example.fgs.designpattern.Factory;

/**
 * 增加了工厂模式商店
 * 只sell肉夹馍，而不关心肉夹馍生产
 * Created by fgs on 2017/1/10.
 */
public class RouJiaMoFactoryStore {
    private SimpleRouJiaMoFactroy factroy;

    public RouJiaMoFactoryStore(SimpleRouJiaMoFactroy factroy)
    {
        this.factroy = factroy;
    }

    /**
     * 根据传入类型卖不同的肉夹馍
     * @param type
     * @return
     */
    public RouJiaMo sellRouJiaMo(String type)
    {
        RouJiaMo rouJiaMo = factroy.createRouJiaMo(type);
//        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }

}
