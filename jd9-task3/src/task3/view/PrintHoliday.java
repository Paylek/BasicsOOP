package task3.view;

import task3.bean.Calendar;
import task3.bean.Calendar.Holiday;

public class PrintHoliday {

	public void printHolidays(Calendar calendar) {
		for (Holiday holiday : calendar.getHolidays()) {
			System.out.println(holiday);
		}
	}

}
