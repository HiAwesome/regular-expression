package com.moqi.book.chapter05;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_12_TXT;

/**
 * @author moqi
 * On 2/27/20 13:53
 */
@Slf4j
public class D01 {

    /**
     * 2020-02-27 13:57:52 INFO  D01:22 - list:[ben@forta.com, support@forta.com, spam@forta.com]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("\\w+@\\w+\\.\\w+", TEXT_12_TXT);
        log.info("list:{}", list);
    }

}
