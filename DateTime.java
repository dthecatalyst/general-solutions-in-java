package com.inputoutput;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class DateTime {
	public static String getDay(String day, String month, String year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.valueOf(year), (Integer.valueOf(month) - 1), Integer.valueOf(day));
		return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, 
				Locale.getDefault()).toUpperCase();

	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();
		System.out.println(getDay(day, month, year));

	}

}
