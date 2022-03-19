package com.ikenna.statisticsrestfulapi.model;

public enum ErrorCodes {
    // something here


    MISSING_PARAMETER_AMOUNT(422, "Parameter missing - amount"),
    MISSING_PARAMETER_TIMESTAMP(422, "Parameter missing - timestamp"),
    INVALID_PARAMETER_AMOUNT(400, "Parameter invalid - amount"),
    INVALID_PARAMETER_TIMESTAMP(400, "Parameter invalid - amount"),
    CLIENT_SERVER_OUT_OF_SYNC(601, "Client Server not in sync"),
    STALE_TIMESTAMP(204, "Clients are too slow"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private Integer errorCode;
    private String errorMessage;

    ErrorCodes(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
