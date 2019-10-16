package com.tianmingxing.autogen.service;

import com.tianmingxing.autogen.common.DbUtil;
import com.tianmingxing.autogen.common.FileUtil;
import com.tianmingxing.autogen.parse.ParseUtil;
import com.tianmingxing.autogen.parse.TableSchemaDTO;
import com.tianmingxing.autogen.template.GenModel;

/**
 * 具体处理生成业务的入口服务
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-09
 */
public class GenService {

    private GenService() {
    }

    public static void gen(String tableName) {
        TableSchemaDTO tableSchemaDto = ParseUtil.parse(DbUtil.getTableSchema(tableName));
        String fileContent = GenModel.load(tableSchemaDto);
        FileUtil.write(fileContent, "D:\\test.txt");
    }
}
