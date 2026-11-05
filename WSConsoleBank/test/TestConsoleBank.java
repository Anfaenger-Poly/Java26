package test;

import bank.account.AccountListDao;
import bank.account.AccountService;
import bank.account.WSAccountService;
import bank.app.menu.StartMenu;
import bank.member.MemberListDao;
import bank.member.MemberService;
import bank.member.WSMemberService;

public class TestConsoleBank {
	public static void main(String[] args) {
		MemberService ms = new WSMemberService(new MemberListDao());
		AccountService as = new WSAccountService(new AccountListDao());
		
		ms.join("wsc", "1234", "wsc");

		new StartMenu(as, ms).run();
	}
}