package com.moqi.book.chapter09;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_34_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class H04 {

    private static final String REGEX = "\\$[0-9.]+";

    /**
     * 2020-03-07 21:32:44 INFO  H04:24 - list:[$23.45, $5.31, $899.00, $69.96]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString(REGEX, TEXT_34_TXT);
        log.info("list:{}", list);
    }

}
