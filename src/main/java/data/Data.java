package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author moqi
 * On 2/27/20 09:43
 */
public class Data {

    public static final String HELLO = "Hello, my name is A01Ben. Please visit my website at http://www.forta.com./";

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

    static {
        List<String> list2 = new ArrayList<>(FILE_NAME_LIST_1);
        list2.add("sales.xls");
        FILE_NAME_LIST_2 = list2;

        List<String> list3 = new ArrayList<>(FILE_NAME_LIST_1);
        list3.add("ca1.xls");
        FILE_NAME_LIST_3 = list3;
    }

}
