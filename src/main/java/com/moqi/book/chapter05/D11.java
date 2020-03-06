package com.moqi.book.chapter05;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_17_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class D11 {

    /**
     * 2020-03-06 23:39:28 INFO  D11:22 - list:[1001: $496.80, 1002: $1290.69, 1004: $613.42, 1006: $414.90]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("\\d+: \\$\\d{3,}\\.\\d{2}", TEXT_17_TXT);
        log.info("list:{}", list);
    }

}
