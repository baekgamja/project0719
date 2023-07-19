package j0719;

import java.util.Scanner;

public class exam_06 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int num=s1.nextInt();
		int result=num%7;
		if(result==0) {
			
			System.out.println(num+"은 7의 배수입니다.");
		}else {
			System.out.println(num+"은 7의 배수가 아닙니다.");
		}

	}

}
