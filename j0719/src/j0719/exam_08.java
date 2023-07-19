package j0719;

import java.util.Scanner;

public class exam_08 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("정수흫 입력하세요 : ");
		int num=s1.nextInt();
		
		if(num>100) {
			System.out.println("100보다 크군요..");
		}else if(num<100) {
			System.out.println("100보다 작군요..");
		}else if(num==100) {
			System.out.println("100과 같군요..");
		}

	}

}
