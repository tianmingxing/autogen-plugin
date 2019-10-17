package com.tianmingxing.autogen.template;

import com.tianmingxing.autogen.parse.TableSchemaDTO;

/**
 * 模板接口类型
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-16
 */
public interface Template {

    /**
     * 渲染模板
     *
     * @param tableSchemaDTO 表描述信息解析模型
     * @param packageName    包名
     * @return 返回渲染好的文本内容
     */
    String render(TableSchemaDTO tableSchemaDTO, String packageName);
}
