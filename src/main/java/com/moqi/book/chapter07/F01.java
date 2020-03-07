package com.moqi.book.chapter07;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_25_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class F01 {

    /**
     * 2020-03-07 11:19:53 INFO  F01:22 - list:[]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("&nbsp;{2,}", TEXT_25_TXT);
        log.info("list:{}", list);
    }

}
