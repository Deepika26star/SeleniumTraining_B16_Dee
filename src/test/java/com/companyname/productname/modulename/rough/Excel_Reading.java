package com.companyname.productname.modulename.rough;

import com.companyname.productname.modulename.utilities.ExcelReader;

public class Excel_Reading {

	public static void main(String[] args) {
		ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+
				"\\src\\test\\resources\\testData\\Test_Data_Sheet.xlsx");
		
		//excel.addSheet("TestDeepika");
		//System.out.println(excel.addColumn("TestDeepika", "Test case Name"));
		//System.out.println(excel.addColumn("TestDeepika", "Run"));
		
		excel.setCellData("TestDeepika", "Sr.NO.", 4, "1");
		excel.setCellData("TestDeepika", "Sr.NO.", 4, "1");
		excel.setCellData("TestDeepika", "Test case Name", 4, "Login");
		excel.setCellData("TestDeepika", "Run", 4,"Yes");
		
		System.out.println(excel.getCellData("TestDeepika", "Test case Name", 4));
		System.out.println("EXPECTED TEST" + excel.getCellData("Test_Data", "Page_Title", 7));
	}
}
