package com.uyghurschool.learnjava.io;

import java.util.HashMap;
import java.util.Map;

public class WriteExcelDemo2 {
    public static void main(String[] args) {
        Map<String,String[]> testCases=new HashMap<String, String[]>();
        testCases.put("1",new String[]{"Test Id","Test Module","Test Status","Tester"});
        testCases.put("2",new String[]{"001","Login","Passed","QA1"});
        testCases.put("3",new String[]{"002","Logout","Passed","QA2"});
        testCases.put("4",new String[]{"003","Clinic","Failed","QA1"});
        testCases.put("5",new String[]{"004","Product","Passed","QA2"});
        ExcelUtilityAdvanced.writeToExcelMultipleCells("doc\\testcases.xlsx","sheet1",testCases);
    }
}
