package com.tianmingxing.autogen.template;

import com.tianmingxing.autogen.parse.TableSchemaDTO;

import java.util.HashMap;
import java.util.Map;

/**
 * 生成Model类
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-09
 */
public class GenModel {

    /**
     * @return 最终要写入文件中的完整内容
     */
    public static String load(TableSchemaDTO tableSchemaDto) {
        Map<String, Object> variables = new HashMap<>();
        return TemplateEngineUtil.process("template/model", variables);
    }
}
