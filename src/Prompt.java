import java.util.Scanner;

public class Prompt {
	
	//변경이 없을때 final 사용
	private static final String PROMPT = "cal> ";
	private Scanner scan = new Scanner(System.in);
	private int month = 0;
	private Calendar cal = new Calendar();
	
	public void runPrompt() {
		month = scan.nextInt();
		while (true) {
			System.out.println("월을 입력하세요.");
			System.out.printf(PROMPT);
			month = scan.nextInt();
			
			if ((month > 12 || month < 1) && month != -1) {
				System.out.println("1~12 까지의 숫자만 입력해주세요.");
				continue;
			} else if (month == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println(month + "월은 " + cal.useArrayGetMaxDaysOfMonth(month) + "일까지 있습니다.");
			}
			cal.printCalendar(month);
		}
		
		scan.close();
	}
	
	public static void main(String []args) {
		Prompt main = new Prompt();
		main.runPrompt();
	}
}
