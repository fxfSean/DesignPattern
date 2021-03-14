package com.example.fgs.designpattern.DependencyInjection.before;

/**
 * 原始方式生产pizza
 */
public class Store {

    private FruitPizza mFruitPizza;
    private SeafoodPizza mSeafoodPizza;
    private LiuLianPizza mLiuLianPizza;


    public FruitPizza getFruitPizza(){
        mFruitPizza = new FruitPizza();
        mFruitPizza.make();
        return mFruitPizza;
    }

    public SeafoodPizza getSeafoodPizza(){
        mSeafoodPizza = new SeafoodPizza();
        mSeafoodPizza.make();
        return mSeafoodPizza;
    }

    public LiuLianPizza getLiuLianPizza(){
        mLiuLianPizza = new LiuLianPizza();
        mLiuLianPizza.make();
        return mLiuLianPizza;
    }
}
