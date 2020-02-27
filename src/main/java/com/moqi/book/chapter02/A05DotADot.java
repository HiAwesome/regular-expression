package com.moqi.book.chapter02;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_02_TXT;


/**
 * @author moqi
 * On 2/27/20 10:01
 */
@Slf4j
public class A05DotADot {

    /**
     * 2020-02-27 10:08:43 INFO  A05DotADot:20 - list:[sal, sal, sal, pac, na1, na2, sa2]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString(".a.", TEXT_02_TXT);
        log.info("list:{}", list);
    }

}
