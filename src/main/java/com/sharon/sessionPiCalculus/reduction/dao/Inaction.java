package com.sharon.sessionPiCalculus.reduction.dao;

import com.sharon.sessionPiCalculus.typing.dao.Types;

public class Inaction extends SubProcess{
    public Inaction() {
        type = Types.END;
    }

    @Override
    public String getString(String channel) {
        return "zero";
    }
}
