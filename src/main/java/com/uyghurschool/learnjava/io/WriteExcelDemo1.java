package com.uyghurschool.learnjava.io;

public class WriteExcelDemo1 {
    public static void main(String[] args) {
        ExcelUtility.writeToExcel("doc\\myexcel.xlsx","sheet1",0,0,"Uyghur");
        ExcelUtility.writeToExcel("doc\\myexcel.xlsx","sheet1",0,1,"School");
    }
}
