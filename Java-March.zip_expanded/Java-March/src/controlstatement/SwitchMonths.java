package controlstatement;

public class SwitchMonths {

	public static void main(String[] args) {
		int month = 13;
		String monthName = getMonthsUsingSwitch(month);
		System.out.println(monthName);
	}

	public static String getMonthsUsingSwitch(int month) {
		String monthValue = "";
		
		switch (month) {
		default:
			monthValue = "In Valid Value";
			break;
		case 3:
			monthValue = "March";
			break;
		case 4:
			monthValue = "April";
			break;
		case 5:
			monthValue = "May";
			break;
		case 6:
			monthValue = "June";
			break;
		case 7:
			monthValue = "July";
			break;
		case 8:
			monthValue = "Aug";
			break;
		case 9:
			monthValue = "Sep";
			break;
		case 1:
			monthValue = "JAN";			
			break;
		case 2:
			monthValue = "FEB";
			break;
		case 10:
			monthValue = "Oct";
			break;
		case 11:
			monthValue = "NOV";
			break;
		case 12:
			monthValue = "DEC";
			break;		
		}
		
		return monthValue;
	}

	public static String getMonths(int month) {
		String monthValue = "";

		if (month == 1) {
			monthValue = "JAN";
		} else if (month == 2) {
			monthValue = "FEB";
		} else if (month == 3) {
			monthValue = "March";
		} else if (month == 4) {
			monthValue = "Apr";
		} else if (month == 5) {
			monthValue = "May";
		} else if (month == 6) {
			monthValue = "June";
		} else if (month == 7) {
			monthValue = "July";
		} else if (month == 8) {
			monthValue = "Aug";
		} else if (month == 9) {
			monthValue = "Sep";
		} else if (month == 10) {
			monthValue = "Oct";
		} else if (month == 11) {
			monthValue = "Nov";
		} else if (month == 12) {
			monthValue = "Dec";
		} else {
			monthValue = "In Valid Value";
		}

		return monthValue;
	}

}
