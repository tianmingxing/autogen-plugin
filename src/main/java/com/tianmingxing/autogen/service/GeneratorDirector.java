package com.tianmingxing.autogen.service;

import com.tianmingxing.autogen.parse.TableSchemaDTO;
import com.tianmingxing.autogen.template.Template;

/**
 * 指导具体的生成过程
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-16
 */
public class GeneratorDirector {

    /**
     * 持有当前需要使用的构建对象
     */
    private GeneratorBuilder builder;

    public GeneratorDirector(GeneratorBuilder builder) {
        this.builder = builder;
    }

    /**
     * 定义整个生成步骤
     *
     * @param dataSourceDTO DB连接信息
     * @param tableNames    表名
     * @param template      要使用的模板
     */
    public void generator(DataSourceDTO dataSourceDTO, String[] tableNames, Template template, String packageName) {
        TableSchemaDTO tableSchemaDTO = builder.parseTable(dataSourceDTO, tableNames);
        String content = builder.renderTemplate(template, tableSchemaDTO, packageName);
        builder.output(content);
    }
}
