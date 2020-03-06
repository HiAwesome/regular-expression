package com.moqi.book.chapter05;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_10_TXT;

/**
 * @author moqi
 * On 2/27/20 10:37
 */
@Slf4j
public class D08 {

    /**
     * 匹配到了空行
     * 2020-03-06 23:29:05 INFO  D08:22 - list:[
     * <p>
     * ]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("[\\r]?\\n[\\r]?\\n", TEXT_10_TXT);
        log.info("list:{}", list);
    }

}
