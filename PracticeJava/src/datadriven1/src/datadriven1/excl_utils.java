package datadriven1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excl_utils {
static	XSSFWorkbook wb =null;
static	XSSFSheet ws = null;
static	XSSFRow xr = null;
static	XSSFCell xc=null;
	
	public static String getdata(int row,int column) throws IOException {
	
		String path =System.getProperty("user.dir")+"//Workbook2.xlsx";
		//System.out.println(path);
		FileInputStream fis = new FileInputStream(path);
		wb=  new XSSFWorkbook(fis);
		ws =wb.getSheet("sheet1");
		xr = ws.getRow(row);//0
		xc =xr.getCell(column);//1
	//	System.out.println(xc.getStringCellValue());
		
		return xc.getStringCellValue();
	}

}
