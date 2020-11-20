package grade;

public class GradeController {
	private GradeService gradeService;
	public GradeController() {
		gradeService = new GradeServiceImpl(); {
		}
		public void postGrade(GradeDto grade) {
			gradeService.addGrade(grade);
		}
		public void putGrade(GradeDto grade) {
			gradeService.updateGrade(grade);
		}
		public void deleteGrade(GradeDto grade) {
			gradeService.deleteGrade(grade);
		}
		public int getSum(GradeDto grade) {
			return gradeService.sum(grade);
		}
		public float getAvg(int sum) {
			return gradeService.avg(sum);
		}
		public GradeDto[] getGradeSort() {
			return gradeService.gradesort();
			
		}
		public int getCount() {
			return gradeService.count();
			
		}
		
	}
}
