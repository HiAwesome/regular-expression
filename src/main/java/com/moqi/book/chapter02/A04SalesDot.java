package com.moqi.book.chapter02;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_03_TXT;

/**
 * @author moqi
 * On 2/27/20 10:01
 */
@Slf4j
public class A04SalesDot {

    /**
     * 2020-02-27 10:07:20 INFO  A04SalesDot:20 - list:[sales1, sales2, sales3, sales.]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("sales.", TEXT_03_TXT);
        log.info("list:{}", list);
    }

}
