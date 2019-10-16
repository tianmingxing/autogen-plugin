package com.tianmingxing.autogen.template;

import com.tianmingxing.autogen.common.DbUtil;
import com.tianmingxing.autogen.parse.ParseUtil;
import com.tianmingxing.autogen.parse.TableSchemaDto;
import org.junit.Test;

public class GenModelAssignmentTest {

    @Test
    public void load() {
        TableSchemaDto tableSchemaDto = ParseUtil.parse(DbUtil.getTableSchema("goods"));
        String content = GenModelAssignment.load(tableSchemaDto);
        System.out.println("======================");
        System.out.println(content);
        System.out.println("======================");
    }
}