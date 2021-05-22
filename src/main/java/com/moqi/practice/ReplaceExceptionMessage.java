package com.moqi.practice;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 替换异常信息文字
 *
 * @author moqi
 * On 2021/5/22 20:53
 */
@Slf4j
public class ReplaceExceptionMessage {

    private static final Pattern METHOD_PO_LIST_PATTERN = Pattern.compile("(^|, )(.+?)\\.(.+?(\\[\\w]))(\\.)(.+?)(?=:)");
    private static final Pattern METHOD_PO_PARAMETER_PATTERN = Pattern.compile("(^|, )(.+?)\\.(.+?)\\.(.+?)(?=:)");
    private static final Pattern METHOD_PARAMETER_PATTERN = Pattern.compile("(^|, )(.+?)\\.(.+?)(?=:)");

    public static void main(String[] args) {
        String parameter = handleParameter("listByTwoNames.namespaceName: must not be blank, listByTwoNames.serviceName: must not be blank");
        log.info("parameter:{}", parameter);

        String handlePoParameter = handlePoParameter("addEnv.onlyFunctionPo.namespaceName: size must be between 4 and 32, addEnv.po.key: must not be blank");
        log.info("handlePoParameter:{}", handlePoParameter);

        String handlePoListParameter = handlePoListParameter("batchAddPort.poPortList[1].extension: Must be json string, batchAddPort.poPortList[1].another: Must be json string");
        log.info("handlePoListParameter:{}", handlePoListParameter);
    }

    public static String handlePoListParameter(String source) {
        Matcher matcher = METHOD_PO_LIST_PATTERN.matcher(source);
        return matcher.replaceAll("$1$4$5$6");
    }

    public static String handlePoParameter(String source) {
        Matcher matcher = METHOD_PO_PARAMETER_PATTERN.matcher(source);
        return matcher.replaceAll("$1$4");
    }

    public static String handleParameter(String source) {
        Matcher matcher = METHOD_PARAMETER_PATTERN.matcher(source);
        return matcher.replaceAll("$1$3");
    }

}
