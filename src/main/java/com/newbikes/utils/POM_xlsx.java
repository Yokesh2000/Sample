package com.newbikes.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POM_xlsx {
	static XSSFWorkbook ww = new XSSFWorkbook();

	public static void Error_message(String error) throws IOException {
		XSSFSheet sheet = ww.createSheet("Error_Message");
		Row dr = sheet.createRow(0);
		dr.createCell(0).setCellValue("Error_Message");
		Row dr1 = sheet.createRow(1);
		dr1.createCell(0).setCellValue(error);
		FileOutputStream out = new FileOutputStream(new File("SampleTest.xlsx"));
		ww.write(out);
		out.close();
	}

	public static void WriteExcel(String[] car) throws IOException {
		XSSFSheet st = ww.createSheet("Used_Cars");
		Row dr = st.createRow(0);
		dr.createCell(0).setCellValue("Popular_Cars_Model(CHENNAI)");
		for (int i = 0; i < (car.length) - 1; i++) {
			Row dr1 = st.createRow(i + 2);
			dr1.createCell(0).setCellValue(car[i]);
		}
		FileOutputStream out = new FileOutputStream(new File("SampleTest.xlsx"));
		ww.write(out);

	}

	public static void WriteExcelfile(String[] bikeName, String[] bikePrice,
			String[] bikeLaunch, int[] price) throws IOException {
		XSSFSheet st1 = ww.createSheet("Upcoming_bikes");
		int count1, count = 2;
		Row dr = st1.createRow(0);
		dr.createCell(0).setCellValue("UPCOMING(HONDA BIKES)");
		dr.createCell(1).setCellValue("PRICE");
		dr.createCell(2).setCellValue("LAUNCH(EXPECTED)");

		for (count1 = 1; count1 < (bikeName.length) - 1; count1++) {
			if (price[count1] < 4) {
				Row dr1 = st1.createRow(count);
				dr1.createCell(0).setCellValue(bikeName[count1]);
				dr1.createCell(1).setCellValue(bikePrice[count1]);
				dr1.createCell(2).setCellValue(bikeLaunch[count1]);
				count++;
			}
		}
		FileOutputStream out = new FileOutputStream(new File("SampleTest.xlsx"));
		ww.write(out);

	}

}