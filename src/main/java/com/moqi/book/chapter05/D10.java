package com.moqi.book.chapter05;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_16_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class D10 {

    /**
     * 2020-03-06 23:35:31 INFO  D10:22 - list:[4/8/03, 10-6-2004, 01-01-01]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("\\d{1,2}[-\\/]\\d{1,2}[-\\/]\\d{2,4}", TEXT_16_TXT);
        log.info("list:{}", list);
    }

}
