package com.vodafone.mock.model;


import java.lang.Boolean;

public class StatusResponse {

    private Boolean isValid;

    public StatusResponse(Boolean isValid){
        this.isValid = isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public Boolean getIsValid() {
        return isValid;
    }
}
