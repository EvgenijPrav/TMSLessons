package com.company.less11;

public class CoinLogicException extends Exception {

    public CoinLogicException() {
    }

    public CoinLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoinLogicException(String message) {
        super(message);
    }

    public CoinLogicException(Throwable exception) {
        super(exception);
    }
}
