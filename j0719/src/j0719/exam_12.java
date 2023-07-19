package j0719;

import java.util.Scanner;

public class exam_12 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("시험 점수를 입력하세요: ");
		int score1=s1.nextInt();
		System.out.println("면접 점수를 입력하세요: ");
		int score2=s1.nextInt();
		
		
		if(score1>=80 && score2>=60) {
			System.out.println("합격을 축하합니다");
		}else {
			System.out.println("아쉽지만 불합격입니다");
		}

	}

}
