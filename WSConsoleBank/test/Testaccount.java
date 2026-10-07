package test;

import java.util.List;

import bank.account.Account;
import bank.account.AccountDao;
import bank.account.AccountListDao;

public class Testaccount {
	public static void main(String[] args) {
		testAccountDao();
	}

	public static void testAccountDao() {
		AccountDao adao = new AccountListDao();
		// 계좌 추가
		adao.save(new Account(12341234, "1111", "1000", 50000));
		adao.save(new Account(43214321, "2222", "1001", 100000));
		
		// 계좌 목록
		System.out.println(">>> 계좌 목록");
		printAccountList(adao.findAll());

		// 계좌 찾기
		System.out.println(">>> 계좌번호로 계좌 찾기");
		Account a = adao.findByNo(12341234);
		System.out.println(a);

		// 회원별 계좌 목록 조회
		System.out.println(">>> 회원별 계좌 목록 조회");
		printAccountList(adao.findBymemberId("1000"));

		// 비밀번호 변경
		System.out.println(">>> 비밀번호 변경");
		a.setPassword("1234");
		adao.update(a);

		// 계좌 삭제
		System.out.println(">>> 계좌 삭제");
		adao.delete(adao.findByNo(43214321));
		printAccountList(adao.findAll());
	}

	public static void printAccountList(List<Account> alist) {
		for (Account a : alist) {
			System.out.println(a);
		}
	}
}