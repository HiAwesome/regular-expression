package com.moqi.book.chapter05;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_15_TXT;

/**
 * @author moqi
 * On 2/27/20 13:53
 */
@Slf4j
public class D06 {

    /**
     * 2020-03-06 23:23:45 INFO  D06:22 - list:[http://www.forta.com/]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("http://[\\w./]+", TEXT_15_TXT);
        log.info("list:{}", list);
    }

}
