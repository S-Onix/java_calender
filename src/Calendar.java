public class Calendar {

	private static final int[] MAX_DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String[] FIRST_DAY = { "SU", "MO", "TU", "WE", "TH", "FR", "SA" };

	public int useArrayGetMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year))
			return LEAP_MAX_DAYS[month];
		else
			return MAX_DAYS[month];
	}

	public int getMaxDaysOfMonth(int month) {
		if (month > 0 && month < 8) {
			if (month == 2) {
				return 28;
			} else if (month != 2 && month % 2 == 0) {
				return 30;
			} else
				return 31;
		} else if (month < 13) {
			if (month % 2 == 0) {
				return 31;
			} else
				return 30;
		}
		return 0;
	}

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}

	// public int isFirstOfDay(String weekend) {
	// int startDayPoint;
	//
	// for (int i = 0; i < FIRST_DAY.length; i++) {
	// if (FIRST_DAY[i].equals(weekend)) {
	// startDayPoint = i;
	// return startDayPoint;
	// }
	// }
	//
	// return -1;
	// }

	/**
	 * 1. 기준날짜를 잡는다 
	 * 2. 기준날짜 ~ 현재 날짜까지의 일수를 구한다 
	 * 3. 기준요일 + 계산된 날짜 % 7 을 통해 그 달 첫째날을 구한다
	 * 
	 */

	private int getWeekDay(int year, int month, int day) {
		// 기준 1970년 달력 1970년 1월 1일 은 목요일
		int syear = 1970;
		final int STANDARD_WEEKDAY = 3;

		int delta;

		// 356, 355

		int count = 0;

		for (int i = syear; i < year; i++) {
			delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}

		for (int i = 1; i < month; i++) {
			delta = useArrayGetMaxDaysOfMonth(year, i);
			count += delta;

		}

		count += day;

		int weekday = (count + STANDARD_WEEKDAY) % 7;

		return weekday;
	}

	public void printCalendar(int year, int month) {

		int MaxDay = useArrayGetMaxDaysOfMonth(year, month);

		// get weekday automatically
		int startWeekend = getWeekDay(year, month, 1);

		System.out.printf("   <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");

		for (int i = 0; i < startWeekend; i++) {
			System.out.printf("   ");
		}

		for (int i = 1; i < MaxDay + 1; i++) {
			if ((i + startWeekend) % 7 == 0) {
				System.out.printf("%3d\n", i);
			} else {
				System.out.printf("%3d", i);
			}
		}
		System.out.println();
	}

}
