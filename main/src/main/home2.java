package main;

import java.util.Scanner;

public class home2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			System.out.print("아파트 의 분양 (면적)을  입력하시오");
			double m2_area1 = s.nextDouble();
			double pyung_area = m2_area1 /3.305;
			System.out.println("아파트의 평형은"+ pyung_area+"입니다");
			if(pyung_area >= 50){
				System.out.print("대형 아파트입니다");
			}
			if(pyung_area >= 30){
				System.out.print("중형 아파트입니다");
			}
			if(pyung_area >= 15){
				System.out.println("중소형 아파트입니다");
			}
			if(pyung_area < 15){
				System.out.print("소형 아파트입니다");
			}
}}
