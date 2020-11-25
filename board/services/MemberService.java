package board.services;

import board.domains.MemberDTO;

// 학생등록, 강사등록, 학생정보수정, 학생정보삭제, 학생로그인,
// 강사등록, 강사접속, 학생목록보기, 학생상세정보, 성적합계, 성적평균, 아이디중복체크
public interface MemberService {
    public void registerGrade(MemberDTO grade);

    public void registerStudent(MemberDTO student);

    public void registerTeacher(MemberDTO teacher);

    public void modifyGrade(MemberDTO grade);

    public void removeGrade(MemberDTO grade);

    public void modifyStudent(MemberDTO student);

    public void removeStudent(MemberDTO student);

    public MemberDTO login(MemberDTO student);

    public MemberDTO access(MemberDTO teacher);

    public MemberDTO[] fetchStudentList();

    public MemberDTO fetchStudentDetail(String userId);

    public int sum(MemberDTO grade);

    public float avg(int sum);

    public boolean existId(String userid);

}
