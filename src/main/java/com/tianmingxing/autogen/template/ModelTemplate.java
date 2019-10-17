package com.tianmingxing.autogen.template;

import com.tianmingxing.autogen.parse.TableSchemaDTO;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * 生成Model类
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-09
 */
public class ModelTemplate implements Template {

    @Override
    public String render(TableSchemaDTO tableSchemaDTO, String packageName) {
        Map<String, Object> variables = new HashMap<>(5, 1);
        variables.put("packageName", packageName);
        variables.put("tableName", tableSchemaDTO.getTableName());
        variables.put("className", tableSchemaDTO.getClassName());
        variables.put("date", LocalDate.now());
        variables.put("fields", tableSchemaDTO.getFields());
        return TemplateEngineUtil.process("template/model", variables);
    }
}
