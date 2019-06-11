package com.biz.controller;

import java.util.Random;

public class RankExec_02 {

	public static void main(String[] args) {

		/*
		 * 학번과 국어점수를 각각 배열로 생성하고 학번은 1번부터 순서대로 부여하고 국어점수는 임의의 값으로 생성하여 저장
		 */
		int[] intNum = new int[10];
		int[] intKor = new int[10];
		Random rnd = new Random();

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = i + 1; // 1번부터 학번 부여
			intKor[i] = rnd.nextInt(50) + 51;
		}
		int index = 0;
		for (int num : intNum) {
			System.out.printf("%d: %d \t", num, intKor[index++]);
		}
		System.out.println();
		for (int i = 0; i < intKor.length; i++) {
			for (int j = i + 1; j < intKor.length; j++) {
				if (intKor[i] > intKor[j]) {
					int _t = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _t;
					int _tt = intNum[i];
					intNum[i] = intNum[j];
					intNum[j] = _tt;

				}
			}
		}
		index = 0;
		for (int num : intNum) {
			System.out.printf("%d: %d \t", num, intKor[index++]);

		}
	}
}