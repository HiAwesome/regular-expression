package com.moqi.book.chapter08;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_30_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class G04 {

    private static final String REGEX = "[ ]+(\\w+)[ ]+\\1";

    /**
     * 020-03-07 19:13:34 INFO  G04:24 - list:[ of of,  are are,  and and]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString(REGEX, TEXT_30_TXT);
        log.info("list:{}", list);
    }

}
