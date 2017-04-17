package cn.blog.service.impl;

import cn.blog.model.User;
import cn.blog.repository.UserRepository;
import cn.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @Coder XIAOYAO
* @Time 2016年4月21日 下午11:00:04
*
*/
@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public int save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUser(String username, String password) {
		return userRepository.getUser(username, password);
	}

}
