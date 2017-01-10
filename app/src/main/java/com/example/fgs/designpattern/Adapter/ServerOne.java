package com.example.fgs.designpattern.Adapter;

/**
 * 适配器：将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * 适配器模式不并是那种会让架构变得更合理的模式，更多的时候它只是充当救火队员的角色，
 * 帮助解决由于前期架构设计不合理导致的接口不匹配的问题。
 * 更好的做法是在设计的时候就尽量把以后可能出现的情况多考虑一些
 * Created by fgs on 2017/1/10.
 */
public class ServerOne implements PlayerCount{
    private ServerFirst mServerFirst;
    public ServerOne(){
        mServerFirst = new ServerFirst();
    }

    @Override
    public String getSeverName() {
        return "ServerOne";
    }

    @Override
    public int getPlayerCount() {
//        return AdapterUtil.getPlayerCount(1);
        return Integer.parseInt(mServerFirst.getPlayerCount(1));
    }
}
