package com.tianmingxing.autogen.template;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.AbstractConfigurableTemplateResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;

/**
 * 保持一个单例的模板引擎实例
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-09
 */
public class TemplateEngineUtil {

    private static final TemplateEngineUtil INSTANCE = new TemplateEngineUtil();

    private final TemplateEngine templateEngine;

    private TemplateEngineUtil() {
        templateEngine = new TemplateEngine();
        AbstractConfigurableTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setTemplateMode(TemplateMode.TEXT);
        templateResolver.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        templateResolver.setSuffix(".tp");

        templateEngine.setTemplateResolver(templateResolver);
    }

    public static TemplateEngine getTemplateEngine() {
        return INSTANCE.templateEngine;
    }

    public static String process(String templatePath, Map<String, Object> variables) {
        return getTemplateEngine().process(templatePath, new Context(Locale.SIMPLIFIED_CHINESE, variables));
    }
}
