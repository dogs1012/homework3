package main;

import java.util.Scanner;

public class home1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		int num1,num2,num3;
		int max_num = 0, min_num = 0;
		System.out.println("ù��° ���ڸ� �Է��Ͻÿ�");
		num1 = s.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��Ͻÿ�");
		num2 = s.nextInt();
		System.out.println("����° ���ڸ� �Է��Ͻÿ�");
		num3 = s.nextInt();
		
		if(num1 > num2){
			max_num = num1;
			}
		else if(num2 > num1){ max_num = num2;}
		if (num2 > num3){
			min_num = num3;		
		}
		else if(num3 > num2){min_num = num2;}
		System.out.println("���� ū ����"+max_num + "�̰� ���� ���� ���� "+ min_num+"�Դϴ�");
		
	}
	
}
