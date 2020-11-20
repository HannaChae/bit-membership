package main;

import java.util.Scanner;

import grade.GradeController;
import grade.GradeDto;

public class GradeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeController gradeController = new GradeController();
		GradeDto grade = null;
		while(true) {
			System.out.println("[메뉴] 0. 종료 1. 성적 등록 2. 등수 발표(이름, 합계, 평균)");
			switch (scanner.next()) {
			case "1":
				System.out.println("이름, 국어점수, 영어점수, 수학점수");
				grade.setName(scanner.next());
				grade.setKor(scanner.nextInt());
				grade.setEng(scanner.nextInt());
				grade.setMath(scanner.nextInt());
				break;
			case "2":
				
				break;
			case "3":
				break;
			case "0":
				System.out.println("시스템 종료");
				return;
			}
		}
	}
}
