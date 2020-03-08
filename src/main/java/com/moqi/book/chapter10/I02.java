package com.moqi.book.chapter10;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_37_TXT;

/**
 * Java 不支持正则表达式嵌入条件
 * 可以看本项目中 Perl 语言实现的此案例： embedded_code_01.pl
 *
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class I02 {

    private static final String REGEX = "(<[Aa]\\s+[^>]+>\\s*)?<[Ii][Mm][Gg]\\s+[^>]+>(?(1)\\s*</[Aa]>)";

    /**
     * Exception in thread "main" java.util.regex.PatternSyntaxException: Unknown inline modifier near index 44
     * (<[Aa]\s+[^>]+>\s*)?<[Ii][Mm][Gg]\s+[^>]+>(?(1)\s*</[Aa]>)
     * ^
     * at java.util.regex.Pattern.error(Pattern.java:1957)
     * at java.util.regex.Pattern.group0(Pattern.java:2896)
     * at java.util.regex.Pattern.sequence(Pattern.java:2053)
     * at java.util.regex.Pattern.expr(Pattern.java:1998)
     * at java.util.regex.Pattern.compile(Pattern.java:1698)
     * at java.util.regex.Pattern.<init>(Pattern.java:1351)
     * at java.util.regex.Pattern.compile(Pattern.java:1028)
     * at com.moqi.tool.Tool.patternString(Tool.java:30)
     * at com.moqi.book.chapter10.I02.main(I02.java:23)
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString(REGEX, TEXT_37_TXT);
        log.info("list:{}", list);
    }

}
