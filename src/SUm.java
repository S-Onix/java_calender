import java.util.Scanner;

public class SUm {
	public static void main(String[] args) {
		//ctrl + shift + n/o  <-- 자동 import
		Scanner scan = new Scanner(System.in);
		
		String s1, s2;
		int number1 , number2;
		
		System.out.println("두 수를 입력하세요");
		
		
		s1 = scan.next();
		s2 = scan.next();
		
		number1 = Integer.parseInt(s1);
		number2 = Integer.parseInt(s2);
		
		//숫자를 바로 입력
//		number1 = scan.nextInt();
//		number2 = scan.nextInt();
		
		System.out.println("두 수의 합은 " + (number1+number2) + "입니다.");
		scan.close();
	}
}
