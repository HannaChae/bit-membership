package main;

import java.util.Scanner;

import user.UserController;
import user.UserDto;
import user.UserService;

public class UserMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserDto user = null;
		UserController userController = new UserController();
		while(true) {
			System.out.println("(1)회원가입* (2)로그인 (3)비밀번호 수정* "
					+ "(4)회원탈퇴* (5)아이디 중복체크 (6)마이페이지 "
					+ "(7)회원목록 (8)아이디검색 (9)이름검색"
					+ "(10)전체 회원수");
			switch (scanner.next()) {
			case "1":
				user = new UserDto();
				System.out.println("[회원가입] 아이디, 비밀번호, 이름");
				user.setId(scanner.next());
				user.setPassword(scanner.next());
				user.setName(scanner.next());
				userController.postJoin(user);
				break;
			case "2":
				user = new UserDto();
				System.out.println("[로그인] 아이디, 비밀번호");
				user.setId(scanner.next());
				user.setPassword(scanner.next());
				UserDto loginUser = userController.postLogin(user);
				if(loginUser == null) {
					System.out.println("로그인 실패");
				}else {
					System.out.println(loginUser.toString());
				}
				break;
			case "3":
				System.out.println("[비밀번호 수정] 아이디, 변경할 비밀번호");
				user.setId(scanner.next());
				user.setPassword(scanner.next());
				userController.update(user);
				break;
			case "4":
				System.out.println("[회원탈퇴] 아이디, 비밀번호");
				user.setId(scanner.next());
				user.setPassword(scanner.next());
				userController.delete(user);
				break;
			case "5":
				System.out.println("[아이디 중복체크] 아이디");
				boolean exist = userController.getIdCheck(scanner.next());
				if(exist) {
					System.out.println("사용가능한 아이디입니다.");
				}else {
					System.out.println("사용 불가능한 아이디입니다.");
				}
				break;
			case "6":
				user = new UserDto();
				System.out.println("[마이페이지] 아이디, 비밀번호");
				user.setId(scanner.next());
				user.setPassword(scanner.next());
				userController.getMyPage(user);
				break;
			case "7":
				System.out.println("[회원목록]");
				UserDto[] list = userController.getUserList();
				break;
			case "8":
				System.out.println("[아이디 검색] 아이디");
				UserDto idSearch = userController.getIdSearch(scanner.next());
				
				break;
			case "9":
				System.out.println("[이름 검색] 이름");
				UserDto[] nameSearch = userController.getNameSearch(scanner.next());
				
				break;
			case "10":
				userController.getCount();
				System.out.printf("[전체회원수] %d명\n", userController.getCount());
				break;
			case "0":
				System.out.println("시스템 종료");
				return;
			}
		}
	}

}
