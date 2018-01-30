package simp.le.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import simp.le.dao.UserDAO;
import simp.le.vo.User;

@Service//인젝트등 을사용할떄
public class UserService {

	@Inject
	private UserDAO udao;
	
	public User getUser() {
		return udao.selectuser();
	}
	public List<User> selectList(){
		return udao.selectuserList();
	}
}
