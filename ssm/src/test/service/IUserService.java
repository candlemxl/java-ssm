package test.service;

import test.pojo.User;

public interface IUserService {
	public User getUserById(int userId);
	public int insert(User record);
}
