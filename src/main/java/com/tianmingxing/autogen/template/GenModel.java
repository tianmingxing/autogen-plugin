package com.tianmingxing.autogen.template;

import com.tianmingxing.autogen.parse.TableSchemaDto;

/**
 * 生成Model类
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-09
 */
public class GenModel {

    /**
     *
     * @return 最终要写入文件中的完整内容
     */
    public static String load(TableSchemaDto tableSchemaDto) {
        return "public class " + tableSchemaDto.getTableName();
    }
}
