package com.moqi.book.chapter04;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_11_TXT;

/**
 * @author moqi
 * On 2/27/20 10:37
 */
@Slf4j
public class C06 {

    /**
     * 2020-02-27 13:39:20 INFO  C06:22 - list:[A1C2E3, M1B4F2, H1H2H2]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("\\w\\d\\w\\d\\w\\d", TEXT_11_TXT);
        log.info("list:{}", list);
    }

}
