package main;

import java.util.Scanner;

public class home3 {

	private static int i;

	public static void main(String[] args) {
		
 		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է��Ͻÿ�. : ");
		int month = s.nextInt();
		System.out.println("���� �Է��Ͻÿ�. : ");
		int day = s.nextInt();	
		int day_count =0;
		int[] a= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i = 0;i<month;++i){			
		day_count+= a[i] ;
		}
		int na=day_count + day;
		System.out.println("�̳�¥�� 1����"+na+"���Դϴ�");
		
		
}
}