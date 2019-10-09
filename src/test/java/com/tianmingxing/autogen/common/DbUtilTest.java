package com.tianmingxing.autogen.common;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DbUtilTest {

    @Test
    public void getTableSchema() {
        String tableNameStr = DbUtil.getTableSchema("goods");
        assertNotNull(tableNameStr);
    }
}