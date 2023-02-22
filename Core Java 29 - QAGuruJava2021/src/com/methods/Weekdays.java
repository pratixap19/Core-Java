package com.methods;

public class Weekdays {

	public String getWeekDay(int num) {

		String weekDay = "";

		if (num == 0) {
			weekDay = "Sunday";
		} else if (num == 1) {
			weekDay = "Monday";
		} else if (num == 2) {
			weekDay = "Tuesday";
		} else if (num == 3) {
			weekDay = "Wednesday";
		}else if (num == 4) {
			weekDay = "Thursday";
		}else if (num == 5) {
			weekDay = "Friday";
		} else if (num == 6) {
			weekDay = "Saturday";
		}

		return weekDay;
	}

	public static void main(String[] args) {

		Weekdays test = new Weekdays();
		String day = test.getWeekDay(6);
		System.out.println("Day is:" + day);

	}

}
