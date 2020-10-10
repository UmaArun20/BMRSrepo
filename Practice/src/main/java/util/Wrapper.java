package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wrapper extends BaseClass {
	
	
	public void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Anandhan\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bmreports.com/bmrs/");
		
	}
	public static String[][] getExcelData() throws Exception{
		
		String[][] xcelData=null;
		
		//Step 1:Covert the file
		File file=new File("./TestData/BmrsData.xls");
		
		//Step 2:Covert as file into stream
		FileInputStream fo= new FileInputStream(file);
		
		//create workbook object with file input stream
		HSSFWorkbook wb=new HSSFWorkbook(fo);
		
		//get sheet from work book
		HSSFSheet sheet=wb.getSheet("Sheet");
		
		//get filled row from sheet
		int rowCount=sheet.getLastRowNum();
		System.out.println("row count "+rowCount); //if row=3 then we need to create		
		
		int col=sheet.getRow(rowCount).getPhysicalNumberOfCells();
		System.out.println("column count"+col);
		
		xcelData =new String[rowCount+1][col];	
		
		//row array interation
		for(int i=1;i<=rowCount;i++) {
			
			//col array interation
			for(int j=0;j<=col-1;j++) {
				
				//setting row
				Row row =sheet.getRow(i);
				
				//Setting j value for row
				Cell cell=row.getCell(j);
				
				System.out.println(cell.getStringCellValue());
				
				//getting value and store into String array
				xcelData[i-1][j]=cell.getStringCellValue();
			}
		}
		

		return xcelData;
	}


	public static void main(String args[]) throws Exception {
		//Wrapper wr=new Wrapper();
		System.out.println(getExcelData());
	}
	
	
	public static void clickonElement(WebElement element) {
		element.click();
	}
	
	
}
