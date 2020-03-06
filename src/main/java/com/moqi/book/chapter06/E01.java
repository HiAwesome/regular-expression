package com.moqi.book.chapter06;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_19_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class E01 {

    /**
     * 2020-03-06 23:51:00 INFO  E01:22 - list:[cat, cat]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("cat", TEXT_19_TXT);
        log.info("list:{}", list);
    }

}
