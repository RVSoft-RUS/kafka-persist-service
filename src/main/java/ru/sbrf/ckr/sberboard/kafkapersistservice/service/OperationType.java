package ru.sbrf.ckr.sberboard.kafkapersistservice.service;

public enum OperationType {
    I("Insert"),  //Insert
    U("Update"),  //Update
    D("Delete");  //Delete

    private String description;

    OperationType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
