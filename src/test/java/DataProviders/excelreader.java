package DataProviders;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class excelreader {
	
	private static XSSFSheet excelWSheet;
	private static XSSFWorkbook excelWBook;
	private static XSSFCell cell;
	private static XSSFRow row;

	/*
	 * This method is to set the File path and to open the Excel file. Pass
	 * Excel Path and Sheet name as Arguments to this method
	 */

	public static void setExcelFile(String Path) throws Exception {

		try {

			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream(Path);

			// Access the Excel workbook
			excelWBook = new XSSFWorkbook(ExcelFile);
		     // Access the Excel Sheet
			excelWSheet = excelWBook.getSheetAt(0);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * This method is to read the test data from the Excel cell. We are passing
	 * parameters as Row number and Column number
	 */

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {
              // Access a particular cell in a sheet
			cell = excelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			return null;
		}
	}


}
