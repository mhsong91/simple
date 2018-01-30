package simp.le.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import simp.le.common.DBcon;
import simp.le.vo.User;

@Repository//창고라고 생각하자
public class UserDAO {
	@Inject
	private DBcon dbc;
	@Inject
	private User user;
	
	public User selectuser() {
			System.out.println(dbc.getConnection());
			user.setAge(20);
			user.setName("명훈이");
			return user;
	}
	public List<User> selectuserList() {
		System.out.println(dbc.getConnection());
		
		List<User> userlist = new ArrayList<User>();
		for(int i=1; i<=6;i++) {
			User user =new User();
			user.setAge(i);
			user.setName("홍길동"+i);
			userlist.add(user);
			}
		
		return userlist;
}
}
