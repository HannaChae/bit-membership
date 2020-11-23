package abstraction;

import java.util.Scanner;

public class GradeApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeController gradeController = new GradeController();
		GradeDto grade = null;
		while (true) {
			System.out.println("[메인] 0. 종료 1. 성적 등록 2. 성적 수정 3. 성적 삭제 4. 등수 발표(이름, 합계, 평균)");
			switch (scanner.next()) {
			case "1":
				grade = new GradeDto();
				System.out.println("이름, 국어점수, 영어점수, 수학점수");
				grade.setName(scanner.next());
				grade.setKor(scanner.nextInt());
				grade.setEng(scanner.nextInt());
				grade.setMath(scanner.nextInt());
				gradeController.postGrade(grade);
				break;
			case "2":
				grade = new GradeDto();
				System.out.print("이름: ");
				grade.setName(scanner.next());
				System.out.println("새로운 국어점수, 영어점수, 수학점수");
				grade.setKor(scanner.nextInt());
				grade.setEng(scanner.nextInt());
				grade.setMath(scanner.nextInt());
				gradeController.putGrade(grade);
				System.out.println(grade.toString());
				break;
			case "3":
				grade = new GradeDto();
				System.out.print("이름: ");
			    grade.setName(scanner.next());
				gradeController.deleteGrade(grade);
				System.out.println(grade.toString());
				break;
			case "4":
				GradeDto[] grades = gradeController.getGradeSort();
				for(int i = 0; i < gradeController.getCount(); i++) {
					System.out.println(grades[i].toString());
				}
				break;
			case "0":
				System.out.println("시스템 종료");
				return;
			}
		}
	}
}
// GradeDto[] grades = gradeController.getGradeSort();
// ServiceImpl에서 저장한걸 가져오기
class GradeDto {
	private String name;
	private int kor, eng, math, sum;
	private float avg;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}
	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;}
	public int getMath() {return math;}
	public void setMath(int math) {this.math = math;}
	public int getSum() {return sum;}
	public void setSum(int sum) {this.sum = sum;}
	public float getAvg() {return avg;}
	public void setAvg(float avg) {this.avg = avg;}
	@Override
	public String toString() {
		return "GradeDto [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg="
				+ avg + "]";
	}
}
interface GradeService {
	public void addGrade(GradeDto grade); 
	public void updateGrade(GradeDto grade);
	public void deleteGrade(GradeDto grade);
	public int sum(GradeDto grade);
	public float avg(int sum);
	public GradeDto[] gradeSort();
	public int count();
}
class GradeServiceImpl implements GradeService {
	private GradeDto[] grades;
	public GradeServiceImpl() {
		grades = new GradeDto[3];
	}
	private int count;
	@Override
	public void addGrade(GradeDto grade) {
		int sum = sum(grade);
		float avg = avg(sum);
		grade.setSum(sum);
		grade.setAvg(avg);
		grades[count] = grade;
		count++;
	}
	@Override
	public void updateGrade(GradeDto grade) {
		for(int i = 0; i < count; i++) {
			if(grade.getName().equals(grades[i].getName())) {
				grades[i].setKor(grade.getKor());
				grades[i].setEng(grade.getEng());
				grades[i].setMath(grade.getMath());	
			}
		}
	}
	@Override
	public void deleteGrade(GradeDto grade) {
		for(int i = 0; i < count; i++) {
			if(grade.getName().equals(grades[i].getName())) {
				grades[i] = grades[count - 1];
				grades[count - 1] = null;
				count--;
				break;
			}
		}
	}
	@Override
	public int sum(GradeDto grade) {
		return grade.getKor() + grade.getEng() + grade.getMath();
	}
	@Override
	public float avg(int sum) {
		return (float) sum / 3;
	}
	@Override
	public GradeDto[] gradeSort() {
		int size = grades.length;
		for(int i = 0; i < size - 1; i++) {
			for(int j = i+1; j < size; j++) {
				if(grades[i].getSum() < grades[j].getSum()) {
					GradeDto t = grades[i];
					grades[i] = grades[j];
					grades[j] = t;
				}
			}
		}
		return grades;
	}
	@Override
	public int count() {
		return count;
	}
}
// private GradeDto[] grades;
// sum과 avg를 만들때 3명을 담을 저장공간을 만들어주는 것
// public GradeServiceImpl() {
// grades = new GradeDto[3];
// } ->필드의 생성자는 필드에서 초기화한다.
class GradeController {
	private GradeService gradeService;
	public GradeController() {gradeService = new GradeServiceImpl();}
	public void postGrade(GradeDto grade) {gradeService.addGrade(grade);}
	public void putGrade(GradeDto grade) {gradeService.updateGrade(grade);}
	public void deleteGrade(GradeDto grade) {gradeService.deleteGrade(grade);}
	public int getSum(GradeDto grade) {return gradeService.sum(grade);}
	public float getAvg(int sum) {return gradeService.avg(sum);}
	public GradeDto[] getGradeSort() {return gradeService.gradeSort();}
	public int getCount() {return gradeService.count();}
}
