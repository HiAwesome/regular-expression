package com.moqi.book.chapter03;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.FILE_NAME_LIST_4;

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
        List<String> list = Tool.patternList("[ns]a[^0-9]\\.xls", FILE_NAME_LIST_4);
        log.info("list:{}", list);
    }

}
