package com.tianmingxing.autogen.service;

/**
 * 基于控制台输出的构建过程
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-16
 */
public class ConsoleBuilderImpl implements GeneratorBuilder {

    @Override
    public void output(String content) {
        System.out.println("########################");
        System.out.println(content);
        System.out.println("########################");
    }
}
