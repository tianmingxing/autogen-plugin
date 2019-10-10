package com.tianmingxing.autogen.template;

import com.tianmingxing.autogen.parse.TableSchemaDto;
import org.junit.Assert;
import org.junit.Test;
import org.thymeleaf.context.Context;

import java.time.LocalDate;
import java.util.Arrays;
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
        variables.put("tableName", "goods");
        variables.put("className", "Goods");
        variables.put("packageName", "com.tianmingxing.autogen.parse");
        variables.put("author", "tianmingxing");
        variables.put("email", "mx.tian@qq.com");
        variables.put("date", LocalDate.now());
        TableSchemaDto.Field f1 = new TableSchemaDto.Field();
        f1.setName("id");
        f1.setType("Integer");
        TableSchemaDto.Field f2 = new TableSchemaDto.Field();
        f2.setName("name");
        variables.put("fields", Arrays.asList(f1, f2));
        String result = TemplateEngineUtil.process("template/model2", variables);
        System.out.println(result);
    }
}