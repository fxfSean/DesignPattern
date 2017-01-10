package com.example.fgs.designpattern.Adapter;

/**
 * Created by fgs on 2017/1/10.
 */
public class XMLBuilder {
    public static String buildXML(PlayerCount playerCount){
        StringBuilder builder = new StringBuilder();
        builder.append("<root>");
        builder.append("<server>").append(playerCount.getSeverName()).append("</server>");
        builder.append("<player_count>").append(playerCount.getPlayerCount()).append("</player_count>");
        builder.append("</root>");
        return builder.toString();
    }
}
