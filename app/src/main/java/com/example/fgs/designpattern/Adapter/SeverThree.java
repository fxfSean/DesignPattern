package com.example.fgs.designpattern.Adapter;

/**
 * Created by fgs on 2017/1/10.
 */
public class SeverThree implements PlayerCount{
    @Override
    public String getSeverName() {
        return "SeverThree";
    }

    @Override
    public int getPlayerCount() {
        return AdapterUtil.getPlayerCount(3);
    }
}
