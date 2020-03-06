package com.moqi.book.chapter06;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_21_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class E05 {

    /**
     * 2020-03-06 23:58:43 INFO  E05:23 - list:[-]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("\\B-\\B", TEXT_21_TXT);
        log.info("list:{}", list);
    }

}
