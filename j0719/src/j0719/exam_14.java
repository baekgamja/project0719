package j0719;

import java.util.Scanner;

public class exam_14 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		int money=10000;
		System.out.println("교통카드 잔액 : "+money);
		
		for(int i=0; money>1300; i++) {
		System.out.println("사용할 금액을 입력하세요. : ");
		i=s1.nextInt();
		money=money-i;
		System.out.println("교통카드 잔액 : "+money);

	}
		System.out.println("잔액이 부족해 교통카드를 사용할 수 없습니다.");

}
}