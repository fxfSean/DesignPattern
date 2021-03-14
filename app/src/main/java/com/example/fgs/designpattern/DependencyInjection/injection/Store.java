package com.example.fgs.designpattern.DependencyInjection.injection;

/**
 * 依赖注入，将Store和Pizza彻底解耦，不关心生产什么Pizza
 * 传入什么，生产什么。此时Store就可以从制作Pizza的角色抽离出来
 * 不自己生产pizza，而变成进货的方式，外部新增什么Pizza和自己无关
 */
public class Store implements PizzaAble{

    private Pizza mPizza;

    @Override
    public void set(Pizza pizza) {
        mPizza = pizza;
        mPizza.make();
    }

    public Pizza getPizza(){
        return mPizza;
    }
//    public Pizza getFruitPizza(){
//        mPizza.make();
//        return mPizza;
//    }
//
//    public Pizza getSeafoodPizza(){
//        mPizza.make();
//        return mPizza;
//    }
//
//    public Pizza getLiuLianPizza(){
//        mPizza.make();
//        return mPizza;
//    }


}
