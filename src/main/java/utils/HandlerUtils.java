package utils;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.ClassPathTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;

public class HandlerUtils {
    private static final String PREFIX = "/templates";
    private static final String SUFFIX = ".html";

    public static String handle(String location, Object data) throws Exception {
        TemplateLoader loader = new ClassPathTemplateLoader();
        loader.setPrefix(PREFIX);
        loader.setSuffix(SUFFIX);
        Handlebars handlebars = new Handlebars(loader);

        Template template = handlebars.compile(location);

        return template.apply(data);
    }

}
