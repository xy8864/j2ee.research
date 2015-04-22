package j2ee.research.struts2.dao;

import java.util.List;

import j2ee.research.struts2.domain.User;

/**
 * Created with IntelliJ IDEA.
 * User: yuan2048
 * Date: 2014-06-09 22:08
 * To change this template use File | Settings | File Templates.
 */
public interface UserMapper{
	public User findById(Long Id);
	public User findByUserName(String username);
	public User login(User user);
	public void insertUser(User user);
	public List<User> findUsers(User user);

}
