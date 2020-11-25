package board.domains;

public class TeacherDTO extends MemberDTO {
    private String accesskey;

    public void setAccesskey(String accesskey) {
        this.accesskey = accesskey;
    }

    public String getAccesskey() {
        return accesskey;
    }
}
