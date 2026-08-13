package de.lubowiecki.libs;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {

    public static void main(String[] args) {

        try(FileInputStream in = new FileInputStream("personal_2026.xlsx")) {

            Workbook workbook = new HSSFWorkbook(in);
            Sheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rows = sheet.iterator();

            while(rows.hasNext()) {

                Row row = rows.next();

                Iterator<Cell> cells = row.cellIterator();
                while(cells.hasNext()) {
                    Cell cell = cells.next();
                    switch (cell.getCellType()) {
                        case STRING -> System.out.println("S: " + cell.getStringCellValue());
                        case NUMERIC -> System.out.println("N: " + cell.getNumericCellValue());
                        case BOOLEAN -> System.out.println("B: " + cell.getBooleanCellValue());
                    }
                }
                System.out.println();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
