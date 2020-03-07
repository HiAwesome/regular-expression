package com.moqi.book.chapter09;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_33_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class H02 {

    private static final String REGEX = ".+(:)";

    /**
     * 2020-03-07 21:25:40 INFO  H02:24 - list:[http:, https:, ftp:]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString(REGEX, TEXT_33_TXT);
        log.info("list:{}", list);
    }

}
