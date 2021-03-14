package com.example.fgs.designpattern.SingleTon;

/**
 * 类加载机制保证单实例
 */
class StaticInnerHolder {
    private static StaticInnerHolder instance;
    private StaticInnerHolder(){}

    public StaticInnerHolder getInstance(){
        return Holder.INSTANCE;
    }

    static class Holder {
        public static StaticInnerHolder INSTANCE = new StaticInnerHolder();
    }
}
