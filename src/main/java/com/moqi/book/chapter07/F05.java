package com.moqi.book.chapter07;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_27_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class F05 {

    private static final String REGEX = "19|20\\d{2}";

    /**
     * 2020-03-07 11:29:58 INFO  F05:24 - list:[19]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString(REGEX, TEXT_27_TXT);
        log.info("list:{}", list);
    }

}
