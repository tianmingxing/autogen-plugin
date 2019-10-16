package com.tianmingxing.autogen.common;

/**
 * 输出类型
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-16
 */
public enum OutputTypeEnum {

    /**
     * 文件
     */
    FILE(0),
    /**
     * 控制台
     */
    CONSOLE(1);
    private int value;

    OutputTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
