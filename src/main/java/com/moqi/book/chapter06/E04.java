package com.moqi.book.chapter06;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_20_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class E04 {

    /**
     * 2020-03-06 23:56:56 INFO  E04:22 - list:[cap, cap]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("cap\\b", TEXT_20_TXT);
        log.info("list:{}", list);
    }

}
