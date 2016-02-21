package test.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import test.dao.IUserDao;
import test.pojo.User;
import test.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

	public int insert(User record) {
		// TODO Auto-generated method stub
		return this.userDao.insert(record);
	}

}
