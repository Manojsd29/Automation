package Examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Fetchfromexcel {
@Test
	public void readDataFromexcel() throws IOException {
		// TODO Auto-generated method stub
       FileInputStream Fis =new FileInputStream("C:\\Users\\sd007\\git\\Automation\\Automation\\src\\test\\resources\\Testdata\\New Microsoft Excel Worksheet.xlsx");
     Workbook wb = WorkbookFactory.create(Fis);
     for(int i=0;i<10;i++) {
  String value = wb.getSheet("Testdata").getRow(i).getCell(0).getStringCellValue();
  System.out.println(value);
Collection<String> AL=  new ArrayList<String>();
AL.add(value);
System.out.println(AL);
	}

}
}