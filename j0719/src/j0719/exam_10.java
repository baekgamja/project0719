package j0719;

import java.util.Scanner;

public class exam_10 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("평점을 입력하세요 : ");
		float score=s1.nextFloat();
		
		if(score>4 && score <5) {
			System.out.println("장학금 대상자입니다");
		
		}else if(score<4 && score>0) {
			System.out.println("장학금 대상자가 아닙니다");
		}

	}

}
