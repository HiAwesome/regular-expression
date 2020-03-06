package com.moqi.book.chapter05;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_14_TXT;

/**
 * @author moqi
 * On 2/27/20 13:53
 */
@Slf4j
public class D04 {

    /**
     * 2020-03-06 23:20:11 INFO  D04:22 - list:[.ben@forta.com]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("[\\w.]+@[\\w.]+\\.\\w+", TEXT_14_TXT);
        log.info("list:{}", list);
    }

}
