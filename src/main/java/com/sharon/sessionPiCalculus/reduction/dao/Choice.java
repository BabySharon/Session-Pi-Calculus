package com.sharon.sessionPiCalculus.reduction.dao;

import com.sharon.sessionPiCalculus.typing.dao.Types;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Choice extends SubProcess {
    Map<String, List<Communication>> process = new HashMap<>();

    public void addProcess(String label, List<Communication> commList){
        process.put(label, commList);
    }
}

