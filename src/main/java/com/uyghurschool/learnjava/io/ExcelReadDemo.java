package com.uyghurschool.learnjava.io;

public class ExcelReadDemo {
    public static void main(String[] args) {
        for(int i=0;i<3;i++) {
            for(int j=0;j<4;j++) {
                String cell = ExcelUtility.readExcelCell("doc\\userinfo.xlsx", "Sheet1", i, j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }

    }
}
