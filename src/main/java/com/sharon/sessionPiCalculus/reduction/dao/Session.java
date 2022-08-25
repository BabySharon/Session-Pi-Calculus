package com.sharon.sessionPiCalculus.reduction.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Session {
    String channel1;
    String channel2;

    public Session(String channel1, String channel2) {
        this.channel1 = channel1;
        this.channel2 = channel2;
    }

    public String getCounterpart(String channel){
        if(channel.equals(channel1))
            return channel2;
        else
            return channel1;
    }

    public List<String> getChannels(){
        return new ArrayList<>(Arrays.asList(channel1, channel2));
    }
}
