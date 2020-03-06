package com.moqi.book.chapter06;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_22_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class E07 {

    /**
     * 2020-03-07 00:05:44 INFO  E07:22 - list:[<?xml version="1.0" encoding="UTF-8" ?>]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("<\\?xml.*\\?>", TEXT_22_TXT);
        log.info("list:{}", list);
    }

}
