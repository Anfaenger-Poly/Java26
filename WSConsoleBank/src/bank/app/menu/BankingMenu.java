package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class BankingMenu extends ConsoleMenu {

	public BankingMenu(AccountService as, MemberService ms) {
		super(as, ms);
		menuList = new String[] {"로그아웃", "계좌 목록", "입금", "출금", "계좌 생성", "계좌 해지", "내 정보"};
	}

	@Override
	public void run() {
		System.out.println("::: 은행 메뉴 :::");
		while (true) {
			int menu = selectMenu();
			switch (menu) {
			case 1 -> BankAllAccountsList();
			case 2 -> BankDeposit();
			case 3 -> BankWithdraw();
			case 4 -> BankCreateAccount();
			case 5 -> BankDeleteAccount();
			case 6 -> new MyInfoMenu(as, ms).run();
			case 0 -> {logout(); return;}
			default -> System.out.println("메뉴에 있는 번호를 선택하세요!!");
			}
		}
	}
	
	private void BankAllAccountsList() {
		System.out.println("::: 계좌 목록 :::");
	}
	
	private void BankDeposit() {
		System.out.println("::: 입금 :::");
	}

	private void BankWithdraw() {
		System.out.println("::: 출금 :::");
	}
		
	private void BankCreateAccount() {
		System.out.println("::: 계좌 생성 :::");
	}
	
	private void BankDeleteAccount() {
		System.out.println("::: 계좌 해지 :::");
	}
	
	private void logout() {
		ms.logout();
		System.out.println("::: 로그아웃 :::");
	}
	
}
