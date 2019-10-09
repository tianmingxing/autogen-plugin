package com.tianmingxing.autogen.template;

import org.junit.Assert;
import org.junit.Test;
import org.thymeleaf.context.Context;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class TemplateEngineUtilTest {

    @Test
    public void getTemplateEngine() {
        Map<String, Object> variables = new HashMap<>();
        variables.put("home", "hello world!");
        String result = TemplateEngineUtil.getTemplateEngine()
                .process("template/model", new Context(Locale.SIMPLIFIED_CHINESE, variables));
        Assert.assertEquals("model=hello world!", result);
    }

    @Test
    public void process() {
        Map<String, Object> variables = new HashMap<>();
        variables.put("home", "hello world!222");
        String result = TemplateEngineUtil.process("template/model", variables);
        Assert.assertEquals("model=hello world!222", result);
    }
}