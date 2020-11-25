package board.domains;

// 게시판 관리등에서 
// 로그인하는 회원을 담당할 Member 클래스
public class MemberDTO {
    // 필드
    protected int userId; // 회원 번호
    protected String userName; // 로그인 id
    protected String password; // 로그인 비밀번호

    // getters/setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // java.lang.Object 메소드 오버라이드
    public boolean equals(Object o) {
        if (o instanceof MemberDTO) {
            MemberDTO m = (MemberDTO) o;
            if (userName.equals(m.userName) && password.equals(m.password)) {
                return true;
            }
        }

        return false;
    }

    public String toString() {
        return "userId: " + userId + ", userName: " + userName + ", password: " + password;
    }

    // 생성자
    public MemberDTO() {
        userName = new String();
        password = new String();
    }

    public MemberDTO(int userId, String userName, String password, String nickName) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }
}
