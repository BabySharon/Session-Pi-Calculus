package com.sharon.sessionPiCalculus;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.sharon.sessionPiCalculus.dao.BasicType;
import com.sharon.sessionPiCalculus.dao.CompositeType;
import com.sharon.sessionPiCalculus.dao.Types;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

// &{l1:!Int, l2:!Int}.!Bool.end
public class SessionTypeDeserializer extends JsonDeserializer {
    public final char BRANCH = '&';
    public final char SELECT = '+';
    public final char RECEIVE = '?';
    public final char SEND = '!';
    public final char END = 'e';

    @Override
    public List<BasicType> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        List<BasicType> type = new ArrayList<>();
        String[] input = jsonParser.getText().split("\\.");
        for (String str : input) {
            switch (str.charAt(0)) {
                case SEND:

                case RECEIVE:
                    type.add(getBasicTypes(str));
                    break;

                case SELECT:

                case BRANCH: {
                    Map<String, List<BasicType>> branch = new HashMap<>();
                    String label = "";
                    List<String> list = Arrays.stream(str.substring(2, str.length() - 2).split("[,|:]"))
                            .map(s -> s.strip()).collect(Collectors.toList());
                    for (int i = 0; i < list.size(); i++) {
                        if (i % 2 == 0)
                            label = list.get(i);
                        else {
                            List<BasicType> basicTypes = Arrays.stream(list.get(i)
                                            .split("\\."))
                                    .map(s -> getBasicTypes(s))
                                    .collect(Collectors.toList());
                            branch.put(label, basicTypes);
                            label = "";
                        }
                    }
                    if (str.charAt(0) == BRANCH)
                        type.add(new CompositeType(str, Types.BRANCH, branch));
                    else
                        type.add(new CompositeType(str, Types.SELECT, branch));
                }

            }
        }
        return type;
    }

    private BasicType getBasicTypes(String s) {
        BasicType bt = null;
        switch (s.charAt(0)) {
            case SEND:
                bt = new BasicType(s, Types.SEND);
                break;

            case RECEIVE:
                bt = new BasicType(s, Types.RECEIVE);
                break;

            case END:
                bt = new BasicType(s, Types.END);
                break;
        }
        return bt;
    }
}
