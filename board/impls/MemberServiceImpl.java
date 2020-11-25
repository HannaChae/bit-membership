package board.impls;

import board.domains.MemberDTO;
import board.services.MemberService;

public class MemberServiceImpl implements MemberService {

    @Override
    public void registerGrade(MemberDTO grade) {
        // TODO Auto-generated method stub

    }

    @Override
    public void registerStudent(MemberDTO student) {
        // TODO Auto-generated method stub

    }

    @Override
    public void registerTeacher(MemberDTO teacher) {
        // TODO Auto-generated method stub

    }

    @Override
    public void modifyGrade(MemberDTO grade) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeGrade(MemberDTO grade) {
        // TODO Auto-generated method stub

    }

    @Override
    public void modifyStudent(MemberDTO student) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeStudent(MemberDTO student) {
        // TODO Auto-generated method stub

    }

    @Override
    public MemberDTO login(MemberDTO student) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MemberDTO access(MemberDTO teacher) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MemberDTO[] fetchStudentList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MemberDTO fetchStudentDetail(String userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int sum(MemberDTO grade) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float avg(int sum) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean existId(String userid) {
        // TODO Auto-generated method stub
        return false;
    }

}