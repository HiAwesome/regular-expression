package com.moqi.book.chapter03;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.REGULAR_TEXT_2;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class B05 {

    /**
     * 2020-02-27 10:30:04 INFO  B05:23 - list:[#336633, #FFFFFF]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("#[0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f]", REGULAR_TEXT_2);
        log.info("list:{}", list);
    }

}
