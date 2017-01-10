package com.example.fgs.designpattern.Adapter;

/**
 * Created by fgs on 2017/1/10.
 */
public class SeverTwo implements PlayerCount{
    @Override
    public String getSeverName() {
        return "SeverTwo";
    }

    @Override
    public int getPlayerCount() {
        return AdapterUtil.getPlayerCount(2);
    }
}
