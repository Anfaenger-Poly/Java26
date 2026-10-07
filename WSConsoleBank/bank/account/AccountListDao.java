package bank.account;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AccountListDao implements AccountDao {
	List<Account> accountDB = new LinkedList<>();

	@Override
	public boolean save(Account a) {
		return accountDB.add(a);
	}

	@Override
	public List<Account> findAll() {
		return new ArrayList<>(accountDB);
	}

	@Override
	public Account findByNo(int no) {
		for (Account a : accountDB) {
			if (a.getNo() == no) {
				return a;
			}
		}
		return null;
	}

	@Override
	public List<Account> findBymemberId(String memberId) {
		List<Account> accounts = new ArrayList<>();
		for (Account a : accountDB) {
			if (a.getMemberId().equals(memberId))
				accounts.add(a);
		}
		return accounts;
	}

	@Override
	public boolean update(Account a) {
		Account target = findByNo(a.getNo());
		if (target == null) return false;
		accountDB.remove(target);
		accountDB.add(a);
		return true;
	}

	@Override
	public boolean delete(Account a) {
		Account target = findByNo(a.getNo());
		if (target == null) return false;
		return accountDB.remove(target);
	}
}