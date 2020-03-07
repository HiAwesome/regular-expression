package com.moqi.book.chapter08;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import static com.moqi.data.Data.TEXT_31_TXT;


/**
 * @author moqi
 * On 2/27/20 13:53
 */
@Slf4j
public class G07 {

    private static final String REGEX = "(\\d{3})(-)(\\d{3})(-)(\\d{4})";
    private static final String REPLACEMENT = "($1) $3-$5";

    /**
     * 2020-03-07 20:29:30 INFO  Tool:46 - sourceString: 313-555-1234
     * 248-555-9999
     * 810-555-9000
     * 2020-03-07 20:29:30 INFO  Tool:51 - after: (313) 555-1234
     * (248) 555-9999
     * (810) 555-9000
     */
    public static void main(String[] args) {
        Tool.regexReplaceAllString(REGEX, TEXT_31_TXT, REPLACEMENT);
    }

}
