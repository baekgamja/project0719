package j0719;

import java.util.Scanner;

public class exam_04 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("첫 번째 수를 입력 하세요 : ");
		int num1=s1.nextInt();
		
		System.out.println("두 번째 수를 입력 하세요 : ");
		int num2=s1.nextInt();
		
		int result;
		result= num1+num2;
		System.out.printf("%d + %d = %d\n",num1, num2, result);
		
		result=num1-num2;
		System.out.printf("%d - %d = %d\n",num1, num2, result);
		
		result=num1*num2;
		System.out.printf("%d * %d = %d\n",num1, num2, result);
		
		result=num1/num2;
		System.out.printf("%d / %d = %d\n",num1, num2, result);
		
		result=num1%num2;
		System.out.printf("%d %% %d = %d\n",num1, num2, result);
		}

}
