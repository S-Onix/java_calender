public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int useArrayGetMaxDaysOfMonth(int month) {
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

	public void printCalendar(int month) {
		int day = MAX_DAYS[month - 1];

		System.out.println("월    화    수    목    금    토    일");
		System.out.println("---------------------");
		for (int i = 1; i < day + 1; i++) {
			if (i % 7 == 0) {
				System.out.println();
			} else if (i > 9) {
				System.out.printf("%d  ", i);
			} else
				System.out.printf("%d   ", i);
		}
		System.out.println();
	}

}
