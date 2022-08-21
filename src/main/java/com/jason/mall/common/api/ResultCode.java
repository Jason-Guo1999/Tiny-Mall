package com.jason.mall.common.api;

/**
 *  Result Code
 */
public enum ResultCode implements IErrorCode {
    SUCCESS(200, "Success!"),
    FAILED(500, "Failed"),
    VALIDATE_FAILED(404, "validate failed"),
    UNAUTHORIZED(401, "unauthorized or token expired"),
    FORBIDDEN(403, "Access denial");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}