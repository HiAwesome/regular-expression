package com.moqi.book.chapter10;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_36_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class I01 {

    private static final String REGEX = "\\(?\\d{3}\\)?-?\\d{3}-\\d{4}";

    /**
     * 2020-03-07 21:50:05 INFO  I01:24 - list:[123-456-7890, (123)456-7890, (123)-456-7890, (123-456-7890]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString(REGEX, TEXT_36_TXT);
        log.info("list:{}", list);
    }

}
