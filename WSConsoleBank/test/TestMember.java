package test;

import java.util.List;

import bank.member.Member;
import bank.member.MemberDao;
import bank.member.MemberListDao;

public class TestMember {
	public static void main(String[] args) {
		testMemberDao();
	}
	
	public static void testMemberDao() {
		MemberDao mdao = new MemberListDao();
		// 회원 추가 및 회원 목록
		System.out.println(">>> 회원 추가 및 회원 목록");
		mdao.save(new Member("woongseok", "1111", "최웅석", null, null));
		mdao.save(new Member("curi", "1111", "큐리", null, null));
		printMemberList(mdao.findAll());
		
		// 회원 찾기
		System.out.println(">>> id로 회원 찾기");
		Member m = mdao.findById("curi");
		System.out.println(m);
		
		System.out.println(">>> 비밀번호 변경");
		m.setPassword("1234");
		mdao.update(m);
		
		mdao.delete(mdao.findById("curi"));
		
		printMemberList(mdao.findAll());
		
		
	}
	
	public static void printMemberList(List<Member> mlist) {
		for (Member m : mlist) {
			System.out.println(m);
		}
	}
}
