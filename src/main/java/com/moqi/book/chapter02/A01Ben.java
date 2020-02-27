package com.moqi.book.chapter02;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_01_TXT;


/**
 * @author moqi
 * On 2/27/20 09:48
 */
@Slf4j
public class A01Ben {

    /**
     * 2020-02-27 09:59:45 INFO  A01Ben:19 - list:[Ben]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("Ben", TEXT_01_TXT);
        log.info("list:{}", list);
    }

}
