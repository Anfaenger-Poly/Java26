package bank.member;

import java.util.List;

public class MemberOracleDao implements MemberDao {

	@Override
	public boolean save(Member m) {
		return false;
	}

	@Override
	public List<Member> findAll() {
		return null;
	}

	@Override
	public Member findById(String id) {
		return null;
	}

	@Override
	public boolean update(Member m) {
		return false;
	}

	@Override
	public boolean delete(Member m) {
		return false;
	}

}
