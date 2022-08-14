package com.sharon.sessionPiCalculus;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SessionTypeDeserializer extends JsonDeserializer {
    @Override
    public List<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        List<String> type = new ArrayList<>();
        String[] input = jsonParser.getText().split("\\.");
        for (String str: input) {
            type.add(str);
        }
        return type;
    }
}
