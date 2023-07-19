package j0719;

import java.util.Scanner;

public class exam_11 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("학생의 평점을 입력하세요: ");
		float score=s1.nextFloat();
		
		if(score<=5 && score>=4.3) {
			System.out.println("전액 장학금이다");
		
		}else if(score<4.3 && score>=4) {
			System.out.println("반액 장학금이다");
		}else if(score<4 && score>=3.7) {
			System.out.println("모범 장학금이다");
		}else if(score<3.7 && score>0) {
			System.out.println("장학금을 받을 수 없다");
		}

	}

}
