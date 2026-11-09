package bank.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bank.app.util.ConnectionFactory;
import bank.app.util.JDBCClose;

public class MemberOracleDao implements MemberDao {
	private ConnectionFactory factory = new ConnectionFactory();

	@Override
	public boolean save(Member m) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = factory.getConnection();
			String sql = "INSERT INTO bank_member (id, password, name, email, mobile, type) VALUES (?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			int loc = 1;
			pstmt.setString(loc++, m.getId());
			pstmt.setString(loc++, m.getPassword());
			pstmt.setString(loc++, m.getName());
			pstmt.setString(loc++, m.getEmail());
			pstmt.setString(loc++, m.getMobile());
			pstmt.setString(loc++, String.valueOf(m.getType()));
			return pstmt.executeUpdate() == 1;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}

	@Override
	public List<Member> findAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		List<Member> members = new ArrayList<>();
		try {
			conn = factory.getConnection();
			pstmt = conn.prepareStatement("SELECT id, password, name, email, mobile, type FROM bank_member");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				members.add(toMember(rs));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		return members;
	}

	@Override
	public Member findById(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = factory.getConnection();
			pstmt = conn.prepareStatement("SELECT id, password, name, email, mobile, type FROM bank_member WHERE id = ?");
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) return toMember(rs);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		return null;
	}

	@Override
	public boolean update(Member m) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = factory.getConnection();
			String sql = "UPDATE bank_member SET password = ?, name = ?, email = ?, mobile = ?, type = ? WHERE id = ?";
			pstmt = conn.prepareStatement(sql);
			int loc = 1;
			pstmt.setString(loc++, m.getPassword());
			pstmt.setString(loc++, m.getName());
			pstmt.setString(loc++, m.getEmail());
			pstmt.setString(loc++, m.getMobile());
			pstmt.setString(loc++, String.valueOf(m.getType()));
			pstmt.setString(loc++, m.getId());
			return pstmt.executeUpdate() == 1;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}

	@Override
	public boolean delete(Member m) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = factory.getConnection();
			pstmt = conn.prepareStatement("DELETE FROM bank_member WHERE id = ?");
			pstmt.setString(1, m.getId());
			return pstmt.executeUpdate() == 1;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}

	private Member toMember(ResultSet rs) throws Exception {
		return new Member(rs.getString("id"), rs.getString("password"), rs.getString("name"),
				rs.getString("email"), rs.getString("mobile"), rs.getString("type").charAt(0));
	}
}