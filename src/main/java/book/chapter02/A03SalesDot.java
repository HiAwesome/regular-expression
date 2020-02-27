package book.chapter02;

import lombok.extern.slf4j.Slf4j;
import tool.Tool;

import java.util.List;

import static book.chapter02.A00Data.FILE_NAME_LIST;

/**
 * @author moqi
 * On 2/27/20 10:01
 */
@Slf4j
public class A03SalesDot {

    public static void main(String[] args) {
        List<String> list = Tool.patternList("sales.", FILE_NAME_LIST);
        // 2020-02-27 10:03:28 INFO  A03SalesDot:20 - list:[sales1, sales2, sales3]
        log.info("list:{}", list);
    }

}
