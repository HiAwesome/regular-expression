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
public class E06 {

    /**
     * 2020-03-07 00:04:18 INFO  E06:22 - list:[<?xml version="1.0" encoding="UTF-8" ?>]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("<\\?xml.*\\?>", TEXT_22_TXT);
        log.info("list:{}", list);
    }

}
