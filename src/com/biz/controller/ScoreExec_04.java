package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_04 {

	public static void main(String[] args) {

		ScoreVO[] sVO1 = new ScoreVO[10];
		Random rnd = new Random();

		for (int i = 0; i < sVO1.length; i++) {
			int intR1 = rnd.nextInt(50) + 51; 
			int intR2 = rnd.nextInt(50) + 51;
			int intR3 = rnd.nextInt(50) + 51;

			sVO1[i] = new ScoreVO();  
			sVO1[i].setNumber("" + (i + 1)); 
			sVO1[i].setKor(intR1);
			sVO1[i].setEng(intR2);
			sVO1[i].setMath(intR3);

			int intTotal = sVO1[i].getKor();
			intTotal += sVO1[i].getEng();
			intTotal += sVO1[i].getMath();
			
			sVO1[i].setTotal(intTotal);
			sVO1[i].setAverage(intTotal / 3);

			System.out.println(sVO1[i].toString());

		}

		//내용확인
//		for(ScoreVO vo : sVO1) {
//			System.out.println(vo.toString());
//		}
		
		System.out.println("====================================================");
		System.out.println("\t\t빅데이터반 성적처리");
		System.out.println("====================================================");
		System.out.println("학번\t국어\t영어\t수학\t평균\t석차\t");
		System.out.println("----------------------------------------------------");
		for(ScoreVO vo : sVO1) {
		System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%5d\t%3d\n",
				vo.getNumber(),
				vo.getKor(),
				vo.getEng(),
				vo.getMath(),
				vo.getTotal(),
				vo.getAverage(),
				vo.getRank()
				);		
		}
		System.out.println("====================================================");
		
	}
}
