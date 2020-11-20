package grade;

public interface GradeService {
	public void addGrade(GradeDto grade);
	public void updateGrade(GradeDto grade);
	public void deleteGrade(GradeDto grade);
	public int sum(GradeDto grade);
	public float avg(int sum);
	public GradeDto[] gradesort();
	public int count();
}
