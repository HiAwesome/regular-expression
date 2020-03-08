package com.moqi.book.chapter10;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_38_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class I04 {

    private static final String REGEX = "\\d{5}(-\\d{4})?";

    /**
     * 2020-03-07 22:19:24 INFO  I04:38 - list:[11111, 22222, 33333, 44444-4444]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString(REGEX, TEXT_38_TXT);
        log.info("list:{}", list);
    }

}
