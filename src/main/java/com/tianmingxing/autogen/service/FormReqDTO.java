package com.tianmingxing.autogen.service;

import com.tianmingxing.autogen.common.TemplateTypeEnum;

import java.util.Arrays;

/**
 * 表单数据提交模型
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-16
 */
public class FormReqDTO {

    private DataSourceDTO dataSourceDTO;
    private String[] tableNames;
    private TemplateTypeEnum templateType;
    private OutputDTO outputDTO;
    private String packageName;

    public DataSourceDTO getDataSourceDTO() {
        return dataSourceDTO;
    }

    public void setDataSourceDTO(DataSourceDTO dataSourceDTO) {
        this.dataSourceDTO = dataSourceDTO;
    }

    public String[] getTableNames() {
        return tableNames;
    }

    public void setTableNames(String[] tableNames) {
        this.tableNames = tableNames;
    }

    public TemplateTypeEnum getTemplateType() {
        return templateType;
    }

    public void setTemplateType(TemplateTypeEnum templateType) {
        this.templateType = templateType;
    }

    public OutputDTO getOutputDTO() {
        return outputDTO;
    }

    public void setOutputDTO(OutputDTO outputDTO) {
        this.outputDTO = outputDTO;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public String toString() {
        return "FormReqDTO{" +
                "dataSourceDTO=" + dataSourceDTO +
                ", tableNames=" + Arrays.toString(tableNames) +
                ", templateType=" + templateType +
                ", outputDTO=" + outputDTO +
                ", packageName='" + packageName + '\'' +
                '}';
    }
}
