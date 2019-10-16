package com.tianmingxing.autogen.template;

import com.tianmingxing.autogen.common.FieldUtil;
import com.tianmingxing.autogen.parse.TableSchemaDTO;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-16
 */
public class GenModelAssignment {

    public static String load(TableSchemaDTO tableSchemaDto) {
        Map<String, Object> variables = new HashMap<>(3,1);
        //获取对象类型名
        variables.put("objectTypeName", tableSchemaDto.getClassName());
        //获取对象变量名
        variables.put("objectVariableName", FieldUtil.parseVariableName(tableSchemaDto.getTableName()));
        variables.put("fields", tableSchemaDto.getFields());
        return TemplateEngineUtil.process("template/model_assignment", variables);
    }
}
