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
public class A03SalesDot {

    /**
     * 2020-02-27 10:03:28 INFO  A03SalesDot:20 - list:[sales1, sales2, sales3]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("sales.", TEXT_02_TXT);
        log.info("list:{}", list);
    }

}
