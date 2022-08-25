package com.sharon.sessionPiCalculus.reduction.dao;

import com.sharon.sessionPiCalculus.typing.dao.Types;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Choice extends SubProcess {
    Map<String, List<Communication>> process = new HashMap<>();

    public Map<String, List<Communication>> getProcess() {
        return process;
    }

    public void addProcess(String label, List<Communication> commList) {
        process.put(label, commList);
    }

    @Override
    public String getString(String channel) {
        StringBuilder sb = new StringBuilder("");
        sb.append(channel).append(" " + type.toString().toLowerCase());
        if (type.equals(Types.BRANCH)) {
            sb.append("{");
            for (String label : process.keySet()) {
                sb.append(label + ": ");
                List<Communication> commList = process.get(label);
                for (Communication c : commList) {
                    sb.append(c.getString(channel)).append(".");
                }
                sb.deleteCharAt(sb.length() - 1);
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("}");
        } else {
            // In case of select only one list for a single label present
            String label = process.keySet().iterator().next();
            sb.append(" "+label+".(");
            List<Communication> commList = process.get(label);
            for (Communication c : commList) {
                sb.append(c.getString(channel)).append(".");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(")");
        }
        return sb.toString();
    }
}

