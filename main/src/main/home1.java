package main;

import java.util.Scanner;

public class home1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		int num1,num2,num3;
		int max_num = 0, min_num = 0;
		System.out.println("첫번째 숫자를 입력하시오");
		num1 = s.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		num2 = s.nextInt();
		System.out.println("세번째 숫자를 입력하시오");
		num3 = s.nextInt();
		
		if(num1 > num2){
			max_num = num1;
			}
		else if(num2 > num1){ max_num = num2;}
		if (num2 > num3){
			min_num = num3;		
		}
		else if(num3 > num2){min_num = num2;}
		System.out.println("가장 큰 수는"+max_num + "이고 가장 작은 수는 "+ min_num+"입니다");
		
	}
	
}
