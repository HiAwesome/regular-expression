package com.moqi.tool;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author moqi
 * On 2/27/20 09:51
 */

public class Tool {

    /**
     * 正则匹配字符串
     */
    public static List<String> patternString(String regex, String sourceString) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sourceString);

        List<String> list = new ArrayList<>();

        while (matcher.find()) {
            list.add(matcher.group());
        }

        return list;
    }

    /**
     * 正则匹配数组字符串
     */
    public static List<String> patternList(String regex, List<String> sourceList) {
        Pattern pattern = Pattern.compile(regex);
        List<String> list = new ArrayList<>();

        sourceList.forEach(x -> {
            Matcher matcher = pattern.matcher(x);
            while (matcher.find()) {
                list.add(matcher.group());
            }
        });

        return list;
    }

}
