package com.moqi.book.chapter04;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_10_FILE_PATH;

/**
 * @author moqi
 * On 2/27/20 10:37
 */
@Slf4j
public class C04 {

    /**
     * 2020-02-27 10:39:59 INFO  C02:22 - list:[myArray[0]]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("\\r\\n\\r\\n", Tool.getStringFromFile(TEXT_10_FILE_PATH));
        log.info("list:{}", list);
    }

}
