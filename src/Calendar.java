public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String[] FIRST_DAY = { "SU", "MO", "TU", "WE", "TH", "FR", "SA" };

	public int useArrayGetMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year))
			return LEAP_MAX_DAYS[month - 1];
		else
			return MAX_DAYS[month - 1];
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

	public int isFirstOfDay(String weekend) {
		int startDayPoint;

		for (int i = 0; i < FIRST_DAY.length; i++) {
			if (FIRST_DAY[i].equals(weekend)) {
				startDayPoint = i;
				return startDayPoint;
			}
		}

		return -1;
	}

	public void printCalendar(int year, int month, String startWeekend) {

		int MaxDay = useArrayGetMaxDaysOfMonth(year, month);
		int startWeekendOfNumber = isFirstOfDay(startWeekend);

		System.out.printf("   <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");

		for (int i = 0; i < startWeekendOfNumber; i++) {
			System.out.printf("   ");
		}

		for (int i = 1; i < MaxDay + 1; i++) {
			if ((i + startWeekendOfNumber) % 7 == 0) {
				System.out.printf("%3d\n", i);
			} else {
				System.out.printf("%3d", i);
			}
		}
		System.out.println();
	}

}
