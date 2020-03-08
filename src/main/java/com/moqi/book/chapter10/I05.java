package com.moqi.book.chapter10;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_38_TXT;

/**
 * Java 不支持正则表达式前后查找条件
 * 可以看本项目中 Perl 语言实现的此案例： search_conditions_before_and_after_01.pl
 *
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class I05 {

    private static final String REGEX = "\\d{5}(?(?=-)-\\d{4})";

    /**
     * Exception in thread "main" java.util.regex.PatternSyntaxException: Unknown inline modifier near index 7
     * \d{5}(?(?=-)-\d{4})
     * ^
     * at java.util.regex.Pattern.error(Pattern.java:1957)
     * at java.util.regex.Pattern.group0(Pattern.java:2896)
     * at java.util.regex.Pattern.sequence(Pattern.java:2053)
     * at java.util.regex.Pattern.expr(Pattern.java:1998)
     * at java.util.regex.Pattern.compile(Pattern.java:1698)
     * at java.util.regex.Pattern.<init>(Pattern.java:1351)
     * at java.util.regex.Pattern.compile(Pattern.java:1028)
     * at com.moqi.tool.Tool.patternString(Tool.java:30)
     * at com.moqi.book.chapter10.I05.main(I05.java:25)
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString(REGEX, TEXT_38_TXT);
        log.info("list:{}", list);
    }

}
