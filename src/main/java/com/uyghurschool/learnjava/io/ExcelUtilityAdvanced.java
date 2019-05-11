package com.uyghurschool.learnjava.io;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class ExcelUtilityAdvanced {
    //define a method to write multiple cell values in an Excel file
    public static void writeToExcelMultipleCells(String filename, String sheetName, Map<String,String[]> excelData)
    {
        //define a file
        File excelFile=new File(filename);
        //define a workbook
        XSSFWorkbook workbook=new XSSFWorkbook();
        //define a worksheet
        XSSFSheet sheet=workbook.createSheet(sheetName);
        //get total rows from the excel data
        Set<String> numberOfRows=excelData.keySet();
        int rowNumber=sheet.getLastRowNum(); //this will return last row number
        for(String key: numberOfRows)
        {
            XSSFRow row=sheet.createRow(rowNumber++); //add row to the excel sheet
            System.out.println("current row number: "+rowNumber); //print row number
            int cellnum=0;
            String[] contents=excelData.get(key); //get the data for each key
            for(String content: contents)
            {
                XSSFCell cell=row.createCell(cellnum++); //add cell to the row
                if(content.equalsIgnoreCase("failed"))
                {
                    CellStyle style=workbook.createCellStyle();
                    style.setBorderRight(BorderStyle.THIN);
                    style.setRightBorderColor(IndexedColors.RED.getIndex());
                    style.setBorderBottom(BorderStyle.THIN);
                    style.setBottomBorderColor(IndexedColors.RED.getIndex());
                    style.setBorderLeft(BorderStyle.THIN);
                    style.setLeftBorderColor(IndexedColors.RED.getIndex());
                    style.setTopBorderColor(IndexedColors.RED.getIndex());
                    style.setBorderTop(BorderStyle.THIN);
                    style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                    cell.setCellStyle(style);
                }
                System.out.println("current cell number : "+cellnum);

                cell.setCellValue(content);
            }
        }
        //define output stream to write a file
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
}
