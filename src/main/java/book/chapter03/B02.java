package book.chapter03;

import lombok.extern.slf4j.Slf4j;
import tool.Tool;

import java.util.List;

import static data.Data.REGULAR_TEXT_1;

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
        List<String> list = Tool.patternString("[Rr]eg[Ee]x", REGULAR_TEXT_1);
        log.info("list:{}", list);
    }

}
