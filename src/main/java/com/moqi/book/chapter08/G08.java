package com.moqi.book.chapter08;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.moqi.data.Data.TEXT_29_TXT;


/**
 * 由于 Java 不支持正则替换的大小写转换，因此需求需要调用 String 的方法实现
 *
 * @author moqi
 * On 2/27/20 13:53
 */
@Slf4j
public class G08 {

    private static final String REGEX = "(<[hH]1>)(.*?)(</[hH]1>)";

    /**
     * 2020-03-07 21:08:18 INFO  G08:42 - list:[<H1>WELCOME TO MY HOMEPAGE</H1>]
     *
     * @see java.lang.String#toUpperCase()
     * @see java.lang.String#toLowerCase()
     */
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(TEXT_29_TXT);

        List<String> list = new ArrayList<>();

        while (matcher.find()) {
            String content = matcher.group(2).toUpperCase();
            list.add(matcher.group(1) + content + matcher.group(3));
        }

        log.info("list:{}", list);
    }

}
