package com.example.fgs.designpattern.Factory;

/**
 * 肉夹馍商店应该与肉夹馍解耦，不关心有什么肉夹馍，而是来什么参数产什么肉夹馍，
 * 这就引出了简单工厂模式，见{@link SimpleRouJiaMoFactroy}
 * Created by fgs on 2017/1/10.
 */
public class RoujiaMoStore {
    /**
     * 根据不同参数卖肉价摸
     */
    public RouJiaMo sellRouJiaMo(String type){
        RouJiaMo rouJiaMo = null;
        if (type.equals("Suan")){
            rouJiaMo = new SuanRouJiaMo();
        }else if (type.equals("La")){
            rouJiaMo = new LaRouJiaMo();
        }else if (type.equals("Tian")){
            rouJiaMo = new TianRouJiaMo();
        }

//        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }
}
