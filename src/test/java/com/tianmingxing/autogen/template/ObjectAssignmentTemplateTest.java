package com.tianmingxing.autogen.template;

import com.tianmingxing.autogen.common.DbUtil;
import com.tianmingxing.autogen.parse.ParseUtil;
import com.tianmingxing.autogen.parse.TableSchemaDTO;
import com.tianmingxing.autogen.service.DataSourceDTO;
import org.junit.Test;

public class ObjectAssignmentTemplateTest {

    @Test
    public void load() {
        TableSchemaDTO tableSchemaDto = ParseUtil.parse(
                DbUtil.getTableSchema(
                        new DataSourceDTO("localhost:3306/test", "root", "root"), "test"));
        String content = new ObjectAssignmentTemplate().render(tableSchemaDto, "com.tianmingxing.example");
        System.out.println("======================");
        System.out.println(content);
        System.out.println("======================");
    }
}