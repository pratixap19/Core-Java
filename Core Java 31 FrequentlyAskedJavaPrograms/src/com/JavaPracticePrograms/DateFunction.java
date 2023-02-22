package com.JavaPracticePrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunction {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		String formattedDate = sdf.format(date);

		System.out.println(formattedDate);
		
}

}
