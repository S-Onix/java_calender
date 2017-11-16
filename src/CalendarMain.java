import java.util.Scanner;

public class CalendarMain {

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

	public void printCalendar() {
		System.out.println("월    화    수    목    금    토    일");
		System.out.println("---------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println();
	}

	public static void main(String[] args) {

		CalendarMain cal = new CalendarMain();
		Scanner scan = new Scanner(System.in);
		String PROMPT = "cal> ";
		

		// utf-8 인코딩 window -> preference -> general -> workspace -> utf-8

		cal.printCalendar();
		
		System.out.println("몇번 반복하여 보고싶으신가요?");
		
		int count = scan.nextInt();

		//반복횟수가 정확하면 for, 아니면 while 사용
		
		for(int i = 0 ; i< count ; i++) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			int month = scan.nextInt();
			System.out.println(month + "월은 " + cal.useArrayGetMaxDaysOfMonth(month)+ "일까지 있습니다.");
		}
		
		while (true) {
			
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			int month = scan.nextInt();
			if ((month > 12 || month < 1) && month != -1) {
				System.out.println("1~12 까지의 숫자만 입력해주세요.");
				continue;
			} else if(month == -1){
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println(month + "월은 " + cal.useArrayGetMaxDaysOfMonth(month) + "일까지 있습니다.");
			}
		}
		
		scan.close();

	}

}
