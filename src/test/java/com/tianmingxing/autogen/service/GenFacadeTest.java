package com.tianmingxing.autogen.service;

import com.tianmingxing.autogen.common.OutputTypeEnum;
import com.tianmingxing.autogen.common.TemplateTypeEnum;
import org.junit.Test;

public class GenFacadeTest {

    @Test
    public void gen() {
        FormReqDTO formReqDTO = new FormReqDTO();
        formReqDTO.setDataSourceDTO(new DataSourceDTO("localhost:3306/test", "root", "root"));
        formReqDTO.setTableNames(new String[]{"goods_schema_template"});
        formReqDTO.setTemplateType(TemplateTypeEnum.OBJECT_ASSIGNMENT);
        formReqDTO.setOutputDTO(new OutputDTO(OutputTypeEnum.CONSOLE));
        GenFacade.gen(formReqDTO);
    }
}