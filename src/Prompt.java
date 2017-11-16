import java.util.Scanner;

public class Prompt {
	
	//변경이 없을때 final 사용
	private Scanner scan = new Scanner(System.in);
	private int month = 0;
	private int year = 2017;
	private String weekend;
	private Calendar cal = new Calendar();
	
	public void runPrompt() {
		while (true) {
			System.out.println("년도를 입력하세요.");
			System.out.printf("YEAR> ");
			year = scan.nextInt();
			System.out.println("월을 입력하세요.");
			System.out.printf("MONTH> ");
			month = scan.nextInt();
			System.out.println("시작 요일을 선택하세요 (\"SU\", \"MO\", \"TU\",, \"WE\", \"TH\", \"FR\", \"SA\")중 하나를 입력해주세요");
			System.out.printf("WEEKEND> ");
			weekend = scan.next();
			
			cal.printCalendar(year, month, weekend);
			
		}
	}
	
	public static void main(String []args) {
		Prompt main = new Prompt();
		main.runPrompt();
	}
}
