package simp.le.user.service;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.stereotype.Service;
import simp.le.user.dao.UserDAO;
import simp.le.user.vo.User;
import simp.le.user.dao.UserDAO;
import simp.le.user.vo.User;

@Service("user.u")//인젝트등 을사용할떄
public class UserService {

	//@Inject
	private UserDAO udao;
	@Inject//생성하면서 호출한다.
	public UserService(@Named("userDAO")UserDAO udao) {
		this.udao=udao;
	}
	@Inject
	public void setUserDAO(UserDAO udao) {
		this.udao=udao;
	}
	
	public User getUser() {
		return udao.selectuser();
	}
	
	/*public List<User> selectList(){
		return udao.selectuserList();
	}*/
}
