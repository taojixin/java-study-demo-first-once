package demo1;

import java.util.Scanner;

public class Exercise_4 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		System.out.println("请输入学生人数：");
		int num = scanf.nextInt();
		int[] score = new int[num];
		int scoreMax = score[0];
		System.out.println("请输入" + num + "个学生的成绩：");
		for(int i = 0;i < score.length;i++) {
			score[i] = scanf.nextInt();
			if(scoreMax < score[i]) {
				scoreMax = score[i];
			}
		}
		char grades;
		for(int i = 0;i < score.length;i++) {
			if((scoreMax - score[i]) < 10){
				grades = 'A';
			}else if((scoreMax - score[i]) < 20){
				grades = 'B';
			}else if((scoreMax - score[i]) < 30){
				grades = 'C';
			}else{
				grades = 'D';
			}
			System.out.println("学生" + (i+1) + "成绩等级为：" + grades);
		}
	}
}
