package book.chapter03;

import lombok.extern.slf4j.Slf4j;
import tool.Tool;

import java.util.List;

import static data.Data.FILE_NAME_LIST_4;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class B03 {

    /**
     * 2020-02-27 10:26:05 INFO  B03:22 - list:[na1.xls, na2.xls, sa2.xls]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternList("[ns]a[0123456789]\\.xls", FILE_NAME_LIST_4);
        log.info("list:{}", list);
    }

}