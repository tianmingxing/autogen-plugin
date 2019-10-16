package com.tianmingxing.autogen.parse;

import com.tianmingxing.autogen.common.DbUtil;
import org.junit.Test;

public class ParseUtilTest {

    @Test
    public void parse() {
        TableSchemaDTO tableSchemaDto = ParseUtil.parse(DbUtil.getTableSchema("goods"));
        System.out.println(tableSchemaDto);
    }
}