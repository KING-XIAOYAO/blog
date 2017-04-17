package cn.blog.service;

import cn.blog.model.User;

/**
* @Coder XIAOYAO
* @Time 2016年4月21日 下午10:59:05
*
*/
public interface UserService {

	/**
	 * 保存用户信息
	 *
	 * @param user 用户信息
	 */
	int save(User user);

	/**
	 * 根据用户名密码查找用户信息
	 *
	 * @param username 用户名密码
	 * @param password 密码
	 * @return 用户信息
	 */
	User getUser(String username, String password);
}
