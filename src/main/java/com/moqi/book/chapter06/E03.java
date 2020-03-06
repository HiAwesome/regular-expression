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
public class E03 {

    /**
     * 2020-03-06 23:56:06 INFO  E03:22 - list:[cap, cap, cap, cap]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("\\bcap", TEXT_20_TXT);
        log.info("list:{}", list);
    }

}
