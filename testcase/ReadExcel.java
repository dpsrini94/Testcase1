package testcase;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public  String[][]  readData() throws Throwable {
		//to setup the excel document path
		XSSFWorkbook nBook= new XSSFWorkbook("./Data/createlead.xlsx");
		
		//to setup the worksheet
		 XSSFSheet nSheet = nBook.getSheet("Sheet1");
		 
		 //toget row and cellcount
		 XSSFRow rowcunt= nSheet.getRow(1);
		 XSSFCell cellcount = rowcunt.getCell(0);
		 
		 //to get last row and cell count
		 int lastRowNum = nSheet.getLastRowNum();
		 System.out.println(lastRowNum);
		 int lastCellNum = rowcunt.getLastCellNum();
		 System.out.println(lastCellNum);
		 
		 //declare 2D data to store the values for data provider
		 String[][] data = new String[lastRowNum][lastCellNum];
		 
		 for (int i = 1; i <= lastCellNum; i++) {
			 for (int j = 0; j < lastCellNum; j++) {
				 
				 String val = nSheet.getRow(i).getCell(j).getStringCellValue();
				 System.out.println(val);
				 data[i-1][j]=val;
				 System.out.println();
			}
		 }
		 return data;
		}
	
}
