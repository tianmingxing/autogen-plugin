package com.tianmingxing.autogen.service;

import com.tianmingxing.autogen.common.OutputTypeEnum;
import com.tianmingxing.autogen.common.TemplateTypeEnum;
import com.tianmingxing.autogen.template.ModelTemplate;
import com.tianmingxing.autogen.template.ObjectAssignmentTemplate;
import com.tianmingxing.autogen.template.Template;

/**
 * 具体处理生成业务的入口服务
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-09
 */
public class GenFacade {

    private GenFacade() {
    }

    /**
     * 总的生成入口
     *
     * @param formReqDTO 表单数据对象模型
     */
    public static void gen(FormReqDTO formReqDTO) {
        Template template = null;
        if (formReqDTO.getTemplateType() == TemplateTypeEnum.OBJECT_ASSIGNMENT) {
            template = new ObjectAssignmentTemplate();
        } else if (formReqDTO.getTemplateType() == TemplateTypeEnum.MODEL) {
            template = new ModelTemplate();
        }

        GeneratorBuilder builder = null;
        if (formReqDTO.getOutputDTO().getOutputType() == OutputTypeEnum.CONSOLE) {
            builder = new ConsoleBuilderImpl();
        }

        GeneratorDirector director = new GeneratorDirector(builder);
        director.generator(formReqDTO.getDataSourceDTO(), formReqDTO.getTableNames(), template, formReqDTO.getPackageName());
    }
}
