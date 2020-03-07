package com.moqi.book.chapter09;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_35_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class H08 {

    private static final String REGEX = "\\b(?<!\\$)\\d+\\b";

    /**
     * 2020-03-07 21:45:40 INFO  H08:24 - list:[100, 50, 60]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString(REGEX, TEXT_35_TXT);
        log.info("list:{}", list);
    }

}
