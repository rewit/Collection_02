package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_03 {

	public static void main(String[] args) {

		// scoreVO클래스를 이용해서 10개의 배열을 생성하고
		// 번호는 순서대로 설정하고
		// 이름은 입력하지 않고
		// kor,eng,math 점수를 각각 난수로 생성 후 저장
		// 단 점수는 51~100점까지
		// 입력된 저장된 값을 콘솔에서 확인하고
		// 총점과 평균을 계산

		ScoreVO[] sVO1 = new ScoreVO[10];
		Random rnd = new Random();

		for (int i = 0; i < sVO1.length; i++) {
			//3과목의 점수를 셋팅
			int intR1 = rnd.nextInt(50) + 51; 
			int intR2 = rnd.nextInt(50) + 51;
			int intR3 = rnd.nextInt(50) + 51;
//1번 방법
			sVO1[i] = new ScoreVO();  
			sVO1[i].setNumber("" + (i + 1)); 
			sVO1[i].setKor(intR1);
			sVO1[i].setEng(intR2);
			sVO1[i].setMath(intR3);
//아래 방법으로도 가능   2번 방법
//			sVO1[i] = new ScoreVO();  
//			sVO1[i].setNumber("" + (i + 1)); 
//			sVO1[i].setKor(rnd.nextInt(50) + 51);
//			sVO1[i].setEng(rnd.nextInt(50) + 51);
//			sVO1[i].setMath(rnd.nextInt(50) + 51);
			
			
			//Number 필드를 private으로 선언했기 때문에
			//다음 코드는 사용불가
			//sVO1[i].Number = ?;
			//때문에 Number값을 저장할 떄 사용할 setter method를 만듬
			
			//Number필드는 String형인데 i값은 int형이다
			//sVO1[i].setNumber(i); 오류발생
			
//			 1. i 값은 0부터 시작하므로 +1을 실행해서 1부터 시작하도록 설정해야한다
//			 2. 따라서 Number필드에 값을 저장하기 위해서는 int형을 String형으로 변환을 시켜야 한다
//			 기존의 자바 전통문법
//			sVO1[i].setNumber(Integer.toString(i+1));
//			int형을 String으로 바꾸는 최근문법
//			sVO1[i].setNumber(""+i+1);
//			하지만 이 코드는 모든 숫자를 문자화 한 후 
//			연결하여 Number값을 01,11,21,31형식으로 바뀌게 된다
//			따라서 먼저 i값에 +1을 실행해서 숫자값으로 1증가시킨후 문자열로 바꾸어야 한다.
//			sVO1[i].setNumber(""+(i+1));
			
			
			//3과목의 총점을 구하는 방법  1번 방법
			int intTotal = sVO1[i].getKor();
			intTotal += sVO1[i].getEng();
			intTotal += sVO1[i].getMath();
			//intTotal = intR1+intR2+intR3 로도 가능
			
			sVO1[i].setTotal(intTotal);
			sVO1[i].setAverage(intTotal / 3);

			System.out.println(sVO1[i].toString());

		}
		//총점 별도로 계산
		for(ScoreVO vo : sVO1) {
			int intKor = vo.getKor();
			int intEng = vo.getEng();
			int intMath = vo.getMath();
			int Total = intKor + intEng + intMath;
		}
		
		
	}

}
