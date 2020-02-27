package com.moqi.book.chapter04;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_07_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class C08 {

    /**
     * 2020-02-27 13:49:02 INFO  C08:23 - list:[#336633, #FFFFFF]
     */
    public static void main(String[] args) {
        // Java Pattern support POSIX character
        List<String> list = Tool.patternString("#\\p{XDigit}\\p{XDigit}\\p{XDigit}\\p{XDigit}\\p{XDigit}\\p{XDigit}", TEXT_07_TXT);
        log.info("list:{}", list);
    }

}
