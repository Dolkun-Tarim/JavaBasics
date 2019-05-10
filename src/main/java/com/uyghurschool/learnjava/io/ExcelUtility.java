package com.uyghurschool.learnjava.io;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtility {
    //write a method to read an excel file
    public static String readExcelCell(String filename, String sheetName,int rowNumber,int colNumber)
    {
        String cellValue=null;
        FileInputStream fileInputStream=null; //define a file stream to read
        try {
            fileInputStream=new FileInputStream(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //define a work book
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //get a worksheet from the book
        XSSFSheet sheet=workbook.getSheet(sheetName);
        //get row from the worksheet
        XSSFRow row=sheet.getRow(rowNumber);
        if(row==null)
        {
            System.out.println("Empty row");
        }
        else {
            XSSFCell cell=row.getCell(colNumber);
            cellValue=cell.getStringCellValue();
        }
        return cellValue;
    }
}
