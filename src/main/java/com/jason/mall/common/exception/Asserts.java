package com.jason.mall.common.exception;


import com.jason.mall.common.api.IErrorCode;

/**
 * Throw Api Exceptions
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}