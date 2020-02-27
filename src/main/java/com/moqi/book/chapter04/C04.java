package com.moqi.book.chapter04;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_10_TXT;

/**
 * @author moqi
 * On 2/27/20 10:37
 */
@Slf4j
public class C04 {

    /**
     * 2020-02-27 13:34:12 INFO  C04:22 - list:[]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("\\r\\n\\r\\n", TEXT_10_TXT);
        log.info("list:{}", list);
    }

}
