package com.moqi.book.chapter03;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_04_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class B01 {

    /**
     * 2020-02-27 10:19:45 INFO  B01:22 - list:[na1.xls, na2.xls, sa2.xls]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("[ns]a.\\.xls", TEXT_04_TXT);
        log.info("list:{}", list);
    }

}
