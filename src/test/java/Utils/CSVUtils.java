package Utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//code for opencsv
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {

    public static List<String[]> readCSV(String filePath) {
        List<String[]> data = new ArrayList<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                data.add(line.split(",")); // Split by comma and add to list
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}



//this code is for csv another type
/*import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {

    public static List<String[]> readCSV(String filePath) {
        List<String[]> data = new ArrayList<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            List<String[]> allData = csvReader.readAll();
            data.addAll(allData);
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        return data;
    }
}
*/



/*public class CSVUtils{

    public static List<String[]> readExcel(String filePath) throws IOException {
        List<String[]> data = new ArrayList<>();
        
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Get the first sheet
            Iterator<Row> rowIterator = sheet.iterator();
            
            // Skip header row
            if (rowIterator.hasNext()) {
                rowIterator.next();
            }

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                int lastCellNum = row.getLastCellNum();
                String[] rowData = new String[lastCellNum];
                
                for (int i = 0; i < lastCellNum; i++) {
                    rowData[i] = row.getCell(i).toString();
                }
                
                data.add(rowData);
            }
        }
        
        return data;
    }
}

*/
