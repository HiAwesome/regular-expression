package com.moqi.book.chapter05;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_07_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class D09 {

    /**
     * 2020-03-06 23:32:31 INFO  D09:23 - list:[#336633, #FFFFFF]
     */
    public static void main(String[] args) {
        // Java Pattern support POSIX character, see here: https://stackoverflow.com/q/6612870
        List<String> list = Tool.patternString("#\\p{XDigit}{6}", TEXT_07_TXT);
        log.info("list:{}", list);
    }

}
