package j0719;

import java.util.Scanner;

public class exam_17 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int choice=1;
		while(choice==1) {
			int a;
			System.out.println("숫자를 입력하세요 : ");
			a=s1.nextInt();
			if(a%2==0) {
				System.out.printf("%d는 짝수입니다.",a);
			}else {
				System.out.printf("%d는 홀수입니다.",a);
			}
			System.out.println("계속하고 싶다면 예 1,그만하고 싶다면 아니요 0을 입력하세요.");
			choice=s1.nextInt();
		}
	}

}
