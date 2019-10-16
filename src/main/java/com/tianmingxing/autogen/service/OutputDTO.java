package com.tianmingxing.autogen.service;

import com.tianmingxing.autogen.common.OutputTypeEnum;

/**
 * 文本输出（写入）数据模型
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-16
 */
public class OutputDTO {

    private OutputTypeEnum outputType;
    private String filePath;

    public OutputDTO(OutputTypeEnum outputType) {
        this.outputType = outputType;
    }

    public OutputDTO(OutputTypeEnum outputType, String filePath) {
        this.outputType = outputType;
        this.filePath = filePath;
    }

    public OutputTypeEnum getOutputType() {
        return outputType;
    }

    public void setOutputType(OutputTypeEnum outputType) {
        this.outputType = outputType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "OutputDTO{" +
                "outputType=" + outputType +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
