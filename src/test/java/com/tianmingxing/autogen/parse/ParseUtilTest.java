package com.tianmingxing.autogen.parse;

import com.tianmingxing.autogen.common.DbUtil;
import com.tianmingxing.autogen.service.DataSourceDTO;
import org.junit.Test;

public class ParseUtilTest {

    @Test
    public void parse() {
        TableSchemaDTO tableSchemaDto = ParseUtil.parse(DbUtil.getTableSchema(
                new DataSourceDTO("localhost:3306/test", "root", "root"), "test"));
        System.out.println(tableSchemaDto);
    }
}