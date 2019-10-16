package com.tianmingxing.autogen.common;

import org.junit.Assert;
import org.junit.Test;

public class FieldUtilTest {

    @Test
    public void test1() {
        String s = FieldUtil.parseClassName("goods_schema_template");
        Assert.assertEquals("GoodsSchemaTemplate", s);

        String s2 = FieldUtil.parseClassName("goods_Schema_Template");
        Assert.assertEquals("GoodsSchemaTemplate", s2);
    }

    @Test
    public void test2() {
        String s = FieldUtil.parseVariableName("purchase_unit_convert_rate");
        Assert.assertEquals("purchaseUnitConvertRate", s);
    }

    @Test
    public void test3() {
        String s = FieldUtil.parseGetterName("purchase_unit_convert_rate");
        Assert.assertEquals("getPurchaseUnitConvertRate", s);

        String s2 = FieldUtil.parseSetterName("purchase_unit_convert_rate");
        Assert.assertEquals("setPurchaseUnitConvertRate", s2);
    }
}