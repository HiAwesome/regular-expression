package com.moqi.book.chapter02;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.HELLO;

/**
 * @author moqi
 * On 2/27/20 10:01
 */
@Slf4j
public class A02My {

    /**
     * 2020-02-27 10:01:27 INFO  A02My:20 - list:[my, my]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("my", HELLO);
        log.info("list:{}", list);
    }

}
