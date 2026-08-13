package de.lubowiecki.libs;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WriteExcel {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Peter", "Parker", "p.parker@shield.org"));
        persons.add(new Person("Carol", "Danvers", "c.danvers@shield.org"));
        persons.add(new Person("Bruce", "Banner", "b.banner@shield.org"));
        persons.add(new Person("Tony", "Stark", "t.stark@shield.org"));
        persons.add(new Person("Natasha", "Romanov", "n.romanov@shield.org"));

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("Personal");

        int rowIndex = 0;
        for(Person person : persons) {
            int cellIndex = 0;
            Row row = sheet.createRow(rowIndex++);
            Cell cell = row.createCell(cellIndex++);
            cell.setCellValue(person.getFirstName());
            cell = row.createCell(cellIndex++);
            cell.setCellValue(person.getLastName());
            cell = row.createCell(cellIndex++);
            cell.setCellValue(person.getEmail());
        }

        try(FileOutputStream out = new FileOutputStream("personal_2026.xlsx")) {
            workbook.write(out);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
