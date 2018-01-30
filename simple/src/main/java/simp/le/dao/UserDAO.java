package simp.le.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import simp.le.vo.User;

@Repository // 창고라고 생각하자=@Named
public class UserDAO {

	@Autowired
	private BasicDataSource bds;
	

	@Inject
	private User user;

	public User selectuser() {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			
			String sql="select * from User_info where uino=? ";
			con = bds.getConnection();
			ps=con.prepareStatement(sql);
			ps.setInt(1,5);
			rs=ps.executeQuery();
			while(rs.next()) {
				user.setUiNO(rs.getInt("uino"));
				user.setUiAge(rs.getInt("uiage"));
				user.setUiId(rs.getString("uiid"));
				
			}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}

		return user;
	}

	/*public List<User> selectuserList() {
		System.out.println(dbc.getConnection());

		List<User> userlist = new ArrayList<User>();
		for (int i = 1; i <= 6; i++) {
			User user = new User();
			user.setAge(i);
			user.setName("홍길동" + i);
			userlist.add(user);
		}

		return userlist;
	}*/
}
