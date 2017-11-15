import java.util.Scanner;

public class CalendarMain {
	
	private static final int [] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int useArrayGetMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public int getMaxDaysOfMonth(int month) {
		int day = 0;
		if(month>0 && month <8) {
			if(month == 2) {
				day = 28;
			}else if(month!=2 && month%2 == 0) {
				day = 30;
			}else day = 31;
		}else if (month < 13) {
			if(month%2 == 0) {
				day = 31;
			}else day = 30;
		}
		return day;
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
	
	public static void main(String []args) {
		
		CalendarMain cal = new CalendarMain();
		Scanner scan = new Scanner(System.in);
		
		//utf-8 인코딩 window -> preference -> general -> workspace -> utf-8
		
		cal.printCalendar();
		
		
		System.out.println("달을 입력하세요.");
		int month = scan.nextInt();	
		if(month > 12) System.out.println("1~12 까지의 숫자만 입력해주세요.");
		else System.out.println(month+"월은 " + cal.useArrayGetMaxDaysOfMonth(month)+ "일까지 있습니다.");
		
		scan.close();
		
	}
	


}
