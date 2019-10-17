package com.tianmingxing.autogen.service;

import com.tianmingxing.autogen.common.AutoGenSysException;
import com.tianmingxing.autogen.common.DbUtil;
import com.tianmingxing.autogen.parse.ParseUtil;
import com.tianmingxing.autogen.parse.TableSchemaDTO;
import com.tianmingxing.autogen.template.Template;

import java.util.Objects;

/**
 * 生成过程的构建器接口
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-16
 */
public interface GeneratorBuilder {

    /**
     * 获取表的描述信息
     *
     * @param dataSourceDTO DB连接信息
     * @param tableNames    表名
     * @return 返回标准的表创建信息
     */
    default TableSchemaDTO parseTable(DataSourceDTO dataSourceDTO, String[] tableNames) {
        //暂时只处理一张表
        String desc = DbUtil.getTableSchema(dataSourceDTO, tableNames[0]);
        if (Objects.isNull(desc)) {
            throw new AutoGenSysException("没有获取到表：" + tableNames[0] + "的信息");
        }
        return ParseUtil.parse(desc);
    }

    /**
     * 根据表描述模型和当前的模板渲染最终的文本内容
     *
     * @param template       前的模板
     * @param tableSchemaDTO 表描述模型
     * @param packageName 包名
     * @return 最终的文本内容
     */
    default String renderTemplate(Template template, TableSchemaDTO tableSchemaDTO, String packageName) {
        return template.render(tableSchemaDTO, packageName);
    }

    /**
     * 将通过具体模板渲染出的最终文本内容输出，具体输出的形式可选。
     *
     * @param content 最终的文本内容
     */
    void output(String content);
}
