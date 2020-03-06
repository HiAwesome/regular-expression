package com.moqi.book.chapter05;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_13_TXT;

/**
 * @author moqi
 * On 2/27/20 13:53
 */
@Slf4j
public class D03 {

    /**
     * 2020-03-06 23:16:38 INFO  D03:22 - list:[ben@forta.com, ben.forta@forta.com, support@forta.com, ben@urgent.forta.com, spam@forta.com]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("[\\w.]+@[\\w.]+\\.\\w+", TEXT_13_TXT);
        log.info("list:{}", list);
    }

}
