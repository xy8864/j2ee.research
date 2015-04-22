package j2ee.research.struts2.service.impl;

import j2ee.research.struts2.dao.UserMapper;
import j2ee.research.struts2.domain.User;
import j2ee.research.struts2.service.UserService;

/**
 * Created with IntelliJ IDEA.
 * User: yuan2048
 * Date: 2014-06-09 22:06
 * To change this template use File | Settings | File Templates.
 */
public class UserServiceImpl implements UserService{
	private UserMapper userMapper;

	public void setUserMapper(UserMapper userMapper){
		this.userMapper=userMapper;
	}

	@Override
	public User findById(Long id){
		if(id==null||id<1)return null;
		return userMapper.findById(id);
	}

	@Override
	public User findByUsername(String username){
		return userMapper.findByUserName(username);
	}

	@Override
	public User login(User user){
		return userMapper.login(user);
	}
}
