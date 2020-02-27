package com.moqi.book.chapter03;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_06_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class B02 {

    /**
     * 2020-02-27 10:23:28 INFO  B02:22 - list:[RegEx, regex]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("[Rr]eg[Ee]x", TEXT_06_TXT);
        log.info("list:{}", list);
    }

}
