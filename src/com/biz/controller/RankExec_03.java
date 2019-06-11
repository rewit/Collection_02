package com.biz.controller;

import java.util.Random;

public class RankExec_03 {

	public static void main(String[] args) {

		int[] intNum = new int[10];
		int[] intKor = new int[10];
		int[] intEng = new int[10];
		int[] intMath = new int[10];
		int[] intTotal = new int[10];

		Random rnd = new Random();

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = i + 1;
			intKor[i] = rnd.nextInt(50) + 51;
			intEng[i] = rnd.nextInt(50) + 51;
			intMath[i] = rnd.nextInt(50) + 51;
		}
		for (int i = 0; i < intTotal.length; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
		}
		for (int i = 0; i < intTotal.length; i++) {
			for (int j = i + 1; j < intTotal.length; j++) {
				if (intTotal[i] > intTotal[j]) {
					int _num = intNum[i];
					intNum[i] = intNum[j];
					intNum[j] = _num;
					int _Total = intTotal[i];
					intTotal[i] = intTotal[j];
					intTotal[j] = _Total;
					int _Kor = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _Kor;
					int _Eng = intEng[i];
					intEng[i] = intEng[j];
					intEng[j] = _Eng;
					int _Math = intMath[i];
					intMath[i] = intMath[j];
					intMath[j] = _Math;
				}
			}

			System.out.printf("%d : %d\t %d\t %d\t %d\t", intNum[i], intKor[i], intEng[i], intMath[i], intTotal[i]);
			System.out.println();

		}

	}

}
