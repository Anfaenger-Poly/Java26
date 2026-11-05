package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class MyInfoMenu extends ConsoleMenu {
	
	public MyInfoMenu(AccountService as, MemberService ms) {
		super(as, ms);
		menuList = new String[] {"돌아가기", "비밀번호 수정", "회원탈퇴"};
		
	}

	@Override
	public void run() {
		System.out.println("::: 내 정보 :::");
		while (true) {
			int menu = selectMenu();
			switch (menu) {
			case 1 -> ChangePassword();
			case 2 -> DeleteMember();
			case 0 -> {return;}
			default -> System.out.println("메뉴에 있는 번호를 선택하세요!!");
			}
		}
	}
	
	private void ChangePassword() {
		System.out.println("::: 비밀번호 수정 :::");
	}
	
	private void DeleteMember() {
		System.out.println("::: 회원탈퇴 :::");
	}

}
