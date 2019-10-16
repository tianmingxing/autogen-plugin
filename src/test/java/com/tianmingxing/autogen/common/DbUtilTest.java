package com.tianmingxing.autogen.common;

import com.tianmingxing.autogen.service.DataSourceDTO;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DbUtilTest {

    @Test
    public void getTableSchema() {
        String tableNameStr = DbUtil.getTableSchema(
                new DataSourceDTO("localhost:3306/test", "root", "root"), "test");
        assertNotNull(tableNameStr);
    }
}