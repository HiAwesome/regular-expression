package com.moqi.data;

import com.moqi.tool.Tool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author moqi
 * On 2/27/20 09:43
 */
public class Data {


    public static final String TEXT_01_TXT = Tool.getStringFromFile("test01.txt");
    public static final String TEXT_02_TXT = Tool.getStringFromFile("test02.txt");
    public static final String TEXT_03_TXT = Tool.getStringFromFile("test03.txt");
    public static final String TEXT_04_TXT = Tool.getStringFromFile("test04.txt");
    public static final String TEXT_05_TXT = Tool.getStringFromFile("test05.txt");

    public static final List<String> FILE_NAME_LIST_1 = Arrays.asList(
            "sales1.xls",
            "sales2.xls",
            "sales3.xls",
            "orders3.xls",
            "apac1.xls",
            "enrope2.xls",
            "na1.xls",
            "na2.xls",
            "sa2.xls"
    );

    public static final List<String> FILE_NAME_LIST_2;

    public static final List<String> FILE_NAME_LIST_3;

    public static final String REGULAR_TEXT_1 = "The phrase \"regular expression\" is often abbreviated as RegEx or regex.";

    public static final List<String> FILE_NAME_LIST_4;

    public static final String REGULAR_TEXT_2 = "<BODY COLOR=\"#336633\" TEXT=\"#FFFFFF\">";

    public static final String REGULAR_TEXT_3 = "if (myArray[0] == 0) {}";

    public static final String REGULAR_TEXT_4 = "\\home\\ben\\sales\\";


    public static final String TEXT_10_FILE_PATH = "test10.txt";

    static {
        List<String> list2 = new ArrayList<>(FILE_NAME_LIST_1);
        list2.add("sales.xls");
        FILE_NAME_LIST_2 = list2;

        List<String> list3 = new ArrayList<>(FILE_NAME_LIST_1);
        list3.add("ca1.xls");
        FILE_NAME_LIST_3 = list3;

        List<String> list4 = new ArrayList<>(FILE_NAME_LIST_3);
        list4.add("sam.xls");
        FILE_NAME_LIST_4 = list4;
    }

}
