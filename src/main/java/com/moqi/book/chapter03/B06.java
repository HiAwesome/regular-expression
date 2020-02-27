package com.moqi.book.chapter03;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_05_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class B06 {

    /**
     * 2020-02-27 10:31:25 INFO  B06:22 - list:[sam.xls]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("[ns]a[^0-9]\\.xls", TEXT_05_TXT);
        log.info("list:{}", list);
    }

}
