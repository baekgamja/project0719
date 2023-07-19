package j0719;

import java.util.Scanner;

public class exam_07 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("첫 번째 수를 입력 하세요(실수) : ");
		float num1= s1.nextFloat();
		System.out.println("두 번째 수를 입력 하세요(실수) : ");
		float num2=s1.nextFloat();
		
		float result;
		
		result=num1+num2;
		System.out.printf("%f + %f = %.2f\n",num1, num2, result);
		
		result=num1-num2;
		System.out.printf("%f - %f = %.2f\n",num1, num2,result);
		
		result=num1*num2;
		System.out.printf("%f * %f = %.2f\n",num1, num2,result);
		
		result=num1/num2;
		System.out.printf("%f / %f = %.2f\n",num1, num2, result);
		
		result=num1%num2;
		System.out.printf("%f %% %f = %.2f\n",num1, num2, result);

	}

}
