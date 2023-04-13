package demofile.MailSend.Imp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import demofile.MailSend.service.MailService;

public class MailSendImp {
	public static void main(String[] args) {

		try {
			FileInputStream mealFile = new FileInputStream(new File("C:\\Users\\ITCae\\OneDrive\\Desktop\\Meal.xlsx"));

			XSSFWorkbook mealworkbook = new XSSFWorkbook(mealFile);
			Sheet mealSheet = mealworkbook.getSheetAt(0);

			FileInputStream idsFile = new FileInputStream(new File("C:\\Users\\ITCae\\OneDrive\\Desktop\\Ids.xlsx"));

			XSSFWorkbook idsworkbook = new XSSFWorkbook(idsFile);
			Sheet idsSheet = mealworkbook.getSheetAt(0);

			
				for (int j =2 ; j < mealSheet.getLastRowNum(); j++) {
//				String mealName = mealSheet.getRow(j).getCell(1).getStringCellValue();
//				List<String> list1 = new ArrayList();
//				list1.add(mealName);
//				System.out.println("name-> " + mealName);
				
				
				String idsName = idsSheet.getRow(2).getCell(0).getStringCellValue();
				List<String> list2 = new ArrayList();
				list2.add(idsName);
				System.out.println(idsName);
				}
			
			System.out.println("done");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
//OUTFile
//FileOutputStream outputStream = new FileOutputStream("C:\\Users\\ITCae\\Downloads\\meal22.xlsx");
//mealworkbook.write(outputStream);
//outputStream.close();
//
//// Close workbook
//mealworkbook.close();