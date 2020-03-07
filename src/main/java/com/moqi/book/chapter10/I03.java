package com.moqi.book.chapter10;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_36_TXT;

/**
 * Java 不支持正则表达式嵌入条件
 *
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class I03 {

    private static final String REGEX = "(\\()?\\d{3}(?(1)\\)|-)\\d{3}-\\d{4}";

    /**
     * Exception in thread "main" java.util.regex.PatternSyntaxException: Unknown inline modifier near index 12
     * (\()?\d{3}(?(1)\)|-)\d{3}-\d{4}
     * ^
     * at java.util.regex.Pattern.error(Pattern.java:1957)
     * at java.util.regex.Pattern.group0(Pattern.java:2896)
     * at java.util.regex.Pattern.sequence(Pattern.java:2053)
     * at java.util.regex.Pattern.expr(Pattern.java:1998)
     * at java.util.regex.Pattern.compile(Pattern.java:1698)
     * at java.util.regex.Pattern.<init>(Pattern.java:1351)
     * at java.util.regex.Pattern.compile(Pattern.java:1028)
     * at com.moqi.tool.Tool.patternString(Tool.java:30)
     * at com.moqi.book.chapter10.I03.main(I03.java:36)
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString(REGEX, TEXT_36_TXT);
        log.info("list:{}", list);
    }

}
