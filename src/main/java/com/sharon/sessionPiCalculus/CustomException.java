package com.sharon.sessionPiCalculus;

import com.sharon.sessionPiCalculus.reduction.dao.Pointers;

public class CustomException extends Exception{
    public Pointers p;

    public CustomException(Pointers p){
        this.p = p;
    }

}
