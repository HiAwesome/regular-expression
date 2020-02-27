package book.chapter02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author moqi
 * On 2/27/20 09:43
 */
public class A00Data {

    static final String HELLO = "Hello, my name is A01Ben. Please visit my website at http://www.forta.com./";

    static final List<String> FILE_NAME_LIST_1 = Arrays.asList(
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

    static final List<String> FILE_NAME_LIST_2;

    static {
        List<String> list2 = new ArrayList<>(FILE_NAME_LIST_1);
        list2.add("sales.xls");
        FILE_NAME_LIST_2 = list2;
    }

}
