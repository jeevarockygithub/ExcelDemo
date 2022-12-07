package exceloperations;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelDemo {

	public static void main(String[] args) {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Emp Info");		
		
		
		Object empdata[][]= {   {"EmpId","Name","Job"},
				        {"101","Jeeva","Enginner"},
				        {"102","Sakthi","Analyst"},
				        {"103","Anbu","Police"},
				
		};
		
		int rows=empdata.length;
		int cols=empdata[0].length;
		
		System.out.println(rows);
		System.out.println(cols);
		
	}

}
