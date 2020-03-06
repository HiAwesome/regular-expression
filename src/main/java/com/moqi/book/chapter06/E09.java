package com.moqi.book.chapter06;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_24_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class E09 {

    /**
     * 2020-03-07 00:33:00 INFO  E09:22 - list:[  // Make sure not empty,   // Init,   // Done]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("(?m)^\\s*//.*$", TEXT_24_TXT);
        log.info("list:{}", list);
    }

}
