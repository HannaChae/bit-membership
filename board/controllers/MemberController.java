package board.controllers;

import board.services.MemberService;
import board.impls.MemberServiceImpl;
import board.domains.TeacherDTO;
import board.domains.MemberDTO;

public class MemberController {
    private MemberService memberService;

    public MemberController() {
        memberService = new MemberServiceImpl();
    }

    public void postStudent(MemberDTO student) {
        memberService.registerStudent(student);
    }

    public void postTeacher(MemberDTO teacher) {
        memberService.registerTeacher(teacher);
    }

    public void updateStudent(MemberDTO student) {
        memberService.modifyStudent(student);
    }

    public void deleteStudent(MemberDTO student) {
        memberService.removeStudent(student);
    }

    public MemberDTO postLogin(MemberDTO student) {
        return memberService.login(student);
    }

    public MemberDTO postAccess(TeacherDTO teacher) {
        return memberService.access(teacher);
    }

    public MemberDTO[] getStudentList() {
        return memberService.fetchStudentList();
    }

    public MemberDTO getStudentDetail(String userId) {
        return memberService.fetchStudentDetail(userId);
    }

    public boolean getExistId(String userid) {
        return memberService.existId(userid);
    }
}
