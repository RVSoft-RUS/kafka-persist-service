package ru.sbrf.ckr.sberboard.kafkapersistservice.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.ArrayList;
import java.util.List;

public class MessageObject {
    private List<String> unknownFields = new ArrayList<>();


    @JsonAnySetter
    public void setUnknownFields(String name, String value) {
        unknownFields.add(name);
    }

    @JsonAnyGetter
    public List<String> getUnknownFields() {
        return unknownFields;
    }
}
