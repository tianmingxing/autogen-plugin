package com.tianmingxing.autogen.common;

/**
 * 系统内部异常
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-16
 */
public class AutoGenSysException extends RuntimeException {

    public AutoGenSysException() {
        super("系统内部异常");
    }

    public AutoGenSysException(String message) {
        super(message);
    }

    public AutoGenSysException(String message, Throwable cause) {
        super(message, cause);
    }

    public AutoGenSysException(Throwable cause) {
        super(cause);
    }

    protected AutoGenSysException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
