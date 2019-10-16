package com.tianmingxing.autogen.template;

import com.tianmingxing.autogen.common.DbUtil;
import com.tianmingxing.autogen.parse.ParseUtil;
import com.tianmingxing.autogen.parse.TableSchemaDTO;
import org.junit.Test;

public class GenModelAssignmentTest {

    @Test
    public void load() {
        TableSchemaDTO tableSchemaDto = ParseUtil.parse(DbUtil.getTableSchema("goods"));
        String content = GenModelAssignment.load(tableSchemaDto);
        System.out.println("======================");
        System.out.println(content);
        System.out.println("======================");
    }
}