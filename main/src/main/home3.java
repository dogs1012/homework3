package main;

import java.util.Scanner;

public class home3 {

	private static int i;

	public static void main(String[] args) {
		
 		Scanner s = new Scanner(System.in);
		System.out.println("월을 입력하시오. : ");
		int month = s.nextInt();
		System.out.println("일을 입력하시오. : ");
		int day = s.nextInt();	
		int day_count =0;
		int[] a= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i = 0;i<month;++i){			
		day_count+= a[i] ;
		}
		int na=day_count + day;
		System.out.println("이날짜는 1년중"+na+"날입니다");
		
		
}
}