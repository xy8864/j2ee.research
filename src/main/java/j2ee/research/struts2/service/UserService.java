package j2ee.research.struts2.service;

import j2ee.research.struts2.domain.User;

/**
 * Created with IntelliJ IDEA.
 * User: yuan2048
 * Date: 2014-06-09 22:05
 * To change this template use File | Settings | File Templates.
 */
public interface UserService{
	public User findById(Long id);
	public User findByUsername(String username);
	public User login(User user);
}
