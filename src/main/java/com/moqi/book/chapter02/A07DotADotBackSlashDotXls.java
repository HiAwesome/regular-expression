package com.moqi.book.chapter02;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.FILE_NAME_LIST_1;

/**
 * @author moqi
 * On 2/27/20 10:01
 */
@Slf4j
public class A07DotADotBackSlashDotXls {

    /**
     * 2020-02-27 10:13:21 INFO  A07DotADotBackSlashDotXls:22 - list:[na1.xls, na2.xls, sa2.xls]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternList(".a.\\.xls", FILE_NAME_LIST_1);
        log.info("list:{}", list);
    }

}
