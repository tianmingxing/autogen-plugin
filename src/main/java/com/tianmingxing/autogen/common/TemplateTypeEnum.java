package com.tianmingxing.autogen.common;

/**
 * 模板类型
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-16
 */
public enum TemplateTypeEnum {

    /**
     * 对象赋值
     */
    OBJECT_ASSIGNMENT(0);

    private int value;

    TemplateTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
