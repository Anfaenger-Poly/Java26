package test;

import java.util.List;

import bank.member.Member;
import bank.member.MemberDao;
import bank.member.MemberMapDao;
import bank.member.MemberOracleDao;
import bank.member.MemberService;
import bank.member.WSMemberService;


public class TestMember {
	public static void main(String[] args) {
//		testMemberDao();
//		testMemberOracleDao();
//		testMemberService();
//		testMemberDao(new MemberMapDao());
		testMemberService(new WSMemberService(new MemberMapDao()));
	}
	
	public static void testMemberOracleDao() {
		MemberDao mdao = new MemberOracleDao();
		
		System.out.println("> 회원추가");
		mdao.save(new Member("aaa", "1111", "회원A", null, null, Member.USER));
		mdao.save(new Member("bbb", "1111", "회원B", null, null, Member.USER));
		mdao.save(new Member("ccc", "1111", "회원C", null, null, Member.USER));
		
		System.out.println("> 회원목록");
		List<Member> members = mdao.findAll();
		printMemberList(members);
		
		System.out.println("> id로 회원 조회");
		Member member = mdao.findById("aaa");
		System.out.println(member);
		
		System.out.println("> 비밀번호 변경");
		member.setPassword("1234");
		mdao.update(member);
		printMemberList(mdao.findAll());
		
		System.out.println("> 회원 삭제");
		mdao.delete(mdao.findById("bbb"));
		printMemberList(mdao.findAll());
		
	}
	
	public static void testMemberService(MemberService ms) {
		
		System.out.println(">> 회원가입 및 목록조회");
		ms.join("curi", "1234", "큐리");
		ms.join("curi2", "1111", "큐리2");
		printMemberList(ms.getAllMembers());
		
		System.out.println(">> 로그인, 로그아웃");
		if (ms.login("curi2", "1111"))
			System.out.println(ms.getLoggedMember());
		ms.logout();
		System.out.println(ms.getLoggedMember());
		
		System.out.println(">> 회원 정보 보기");
		ms.login("curi", "1234");
		System.out.println(ms.getMemberInfo("curi"));
		
		System.out.println(">> 비밀번호 변경");
		ms.login("curi2", "1111");
		System.out.println(ms.changePassword("curi2", "1111", "cccc"));
		printMemberList(ms.getAllMembers());
	
	}	
	
	public static void testMemberDao(MemberDao mdao) {
		// 회원 추가 및 회원 목록
		System.out.println(">>> 회원 추가 및 회원 목록");
		mdao.save(new Member("admin", "1234", "admin", null, null, Member.ADMIN));
		mdao.save(new Member("woongseok", "1111", "최웅석", null, null, Member.USER));
		mdao.save(new Member("curi", "1111", "큐리", null, null, Member.USER));
		printMemberList(mdao.findAll());
		
		// 회원 찾기
		System.out.println(">>> id로 회원 찾기");
		Member m = mdao.findById("curi");
		System.out.println(m);
		
		System.out.println(">>> 비밀번호 변경");
		m.setPassword("1234");
		mdao.update(m);
		printMemberList(mdao.findAll());
		
		System.out.println(">>> 회원 삭제");
		mdao.delete(mdao.findById("curi"));
		printMemberList(mdao.findAll());
		
	}

	
	public static void printMemberList(List<Member> mlist) {
		for (Member m : mlist) {
			System.out.println(m);
		}
	}
}