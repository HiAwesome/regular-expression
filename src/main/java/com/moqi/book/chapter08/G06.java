package com.moqi.book.chapter08;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import static com.moqi.data.Data.TEXT_14_TXT;


/**
 * @author moqi
 * On 2/27/20 13:53
 */
@Slf4j
public class G06 {

    private static final String REGEX = "(\\w+[\\w.]+@[\\w.]+\\.\\w+)";
    private static final String REPLACEMENT = "<A HREF=\"mailto:$1\">$1</A>";

    /**
     * 2020-03-07 19:47:09 INFO  Tool:46 - sourceString: Hello ben@forta.com is my email address.
     * 2020-03-07 19:47:09 INFO  Tool:51 - after: Hello <A HREF="mailto:ben@forta.com">ben@forta.com</A> is my email address.
     */
    public static void main(String[] args) {
        Tool.regexReplaceAllString(REGEX, TEXT_14_TXT, REPLACEMENT);
    }

}
