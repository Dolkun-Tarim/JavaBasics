package com.uyghurschool.learnjava.io;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelUtility {
    //write a method to write content to an excel file cell
    public static void writeToExcel(String filename,String sheetName,int rowNum,int cellNumber,String content)
    {
        //define a file to write
        File excelFile=new File(filename);
        //define a work book
        XSSFWorkbook workbook=new XSSFWorkbook();
        //define a worksheet
        XSSFSheet sheet=workbook.createSheet(sheetName);
        //define a row in the worksheet
        XSSFRow row=sheet.createRow(rowNum);
        //define a cell in the row
        XSSFCell cell=row.createCell(cellNumber);
        //add content to the cell
        cell.setCellValue(content);
        //write the excel content as a file
        FileOutputStream outputStream=null;
        try {
            outputStream=new FileOutputStream(excelFile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
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
